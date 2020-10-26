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

@Tag("0")
class Record_2641 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2641: FirstName is Alfonzo")
	void FirstNameOfRecord2641() {
		assertEquals("Alfonzo", customers.get(2640).getFirstName());
	}

	@Test
	@DisplayName("Record 2641: LastName is Bound")
	void LastNameOfRecord2641() {
		assertEquals("Bound", customers.get(2640).getLastName());
	}

	@Test
	@DisplayName("Record 2641: Company is Moger, Daniel W Jr")
	void CompanyOfRecord2641() {
		assertEquals("Moger, Daniel W Jr", customers.get(2640).getCompany());
	}

	@Test
	@DisplayName("Record 2641: Address is 7545 Winnetka Ave")
	void AddressOfRecord2641() {
		assertEquals("7545 Winnetka Ave", customers.get(2640).getAddress());
	}

	@Test
	@DisplayName("Record 2641: City is Winnetka")
	void CityOfRecord2641() {
		assertEquals("Winnetka", customers.get(2640).getCity());
	}

	@Test
	@DisplayName("Record 2641: County is Los Angeles")
	void CountyOfRecord2641() {
		assertEquals("Los Angeles", customers.get(2640).getCounty());
	}

	@Test
	@DisplayName("Record 2641: State is CA")
	void StateOfRecord2641() {
		assertEquals("CA", customers.get(2640).getState());
	}

	@Test
	@DisplayName("Record 2641: ZIP is 91306")
	void ZIPOfRecord2641() {
		assertEquals("91306", customers.get(2640).getZIP());
	}

	@Test
	@DisplayName("Record 2641: Phone is 818-772-6769")
	void PhoneOfRecord2641() {
		assertEquals("818-772-6769", customers.get(2640).getPhone());
	}

	@Test
	@DisplayName("Record 2641: Fax is 818-772-8299")
	void FaxOfRecord2641() {
		assertEquals("818-772-8299", customers.get(2640).getFax());
	}

	@Test
	@DisplayName("Record 2641: Email is alfonzo@bound.com")
	void EmailOfRecord2641() {
		assertEquals("alfonzo@bound.com", customers.get(2640).getEmail());
	}

	@Test
	@DisplayName("Record 2641: Web is http://www.alfonzobound.com")
	void WebOfRecord2641() {
		assertEquals("http://www.alfonzobound.com", customers.get(2640).getWeb());
	}
}
