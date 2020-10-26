package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("6")
class Record_2751 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2751: FirstName is Yvonne")
	void FirstNameOfRecord2751() {
		assertEquals("Yvonne", customers.get(2750).getFirstName());
	}

	@Test
	@DisplayName("Record 2751: LastName is Bunt")
	void LastNameOfRecord2751() {
		assertEquals("Bunt", customers.get(2750).getLastName());
	}

	@Test
	@DisplayName("Record 2751: Company is Lapeer Team Work Inc")
	void CompanyOfRecord2751() {
		assertEquals("Lapeer Team Work Inc", customers.get(2750).getCompany());
	}

	@Test
	@DisplayName("Record 2751: Address is 2326 York Rd")
	void AddressOfRecord2751() {
		assertEquals("2326 York Rd", customers.get(2750).getAddress());
	}

	@Test
	@DisplayName("Record 2751: City is Lutherville Timonium")
	void CityOfRecord2751() {
		assertEquals("Lutherville Timonium", customers.get(2750).getCity());
	}

	@Test
	@DisplayName("Record 2751: County is Baltimore")
	void CountyOfRecord2751() {
		assertEquals("Baltimore", customers.get(2750).getCounty());
	}

	@Test
	@DisplayName("Record 2751: State is MD")
	void StateOfRecord2751() {
		assertEquals("MD", customers.get(2750).getState());
	}

	@Test
	@DisplayName("Record 2751: ZIP is 21093")
	void ZIPOfRecord2751() {
		assertEquals("21093", customers.get(2750).getZIP());
	}

	@Test
	@DisplayName("Record 2751: Phone is 410-561-2017")
	void PhoneOfRecord2751() {
		assertEquals("410-561-2017", customers.get(2750).getPhone());
	}

	@Test
	@DisplayName("Record 2751: Fax is 410-561-0798")
	void FaxOfRecord2751() {
		assertEquals("410-561-0798", customers.get(2750).getFax());
	}

	@Test
	@DisplayName("Record 2751: Email is yvonne@bunt.com")
	void EmailOfRecord2751() {
		assertEquals("yvonne@bunt.com", customers.get(2750).getEmail());
	}

	@Test
	@DisplayName("Record 2751: Web is http://www.yvonnebunt.com")
	void WebOfRecord2751() {
		assertEquals("http://www.yvonnebunt.com", customers.get(2750).getWeb());
	}
}
