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

@Tag("24")
class Record_930 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 930: FirstName is Birdie")
	void FirstNameOfRecord930() {
		assertEquals("Birdie", customers.get(929).getFirstName());
	}

	@Test
	@DisplayName("Record 930: LastName is Henschen")
	void LastNameOfRecord930() {
		assertEquals("Henschen", customers.get(929).getLastName());
	}

	@Test
	@DisplayName("Record 930: Company is Lake, William M Esq")
	void CompanyOfRecord930() {
		assertEquals("Lake, William M Esq", customers.get(929).getCompany());
	}

	@Test
	@DisplayName("Record 930: Address is 108 Old Solomons Island Rd")
	void AddressOfRecord930() {
		assertEquals("108 Old Solomons Island Rd", customers.get(929).getAddress());
	}

	@Test
	@DisplayName("Record 930: City is Annapolis")
	void CityOfRecord930() {
		assertEquals("Annapolis", customers.get(929).getCity());
	}

	@Test
	@DisplayName("Record 930: County is Anne Arundel")
	void CountyOfRecord930() {
		assertEquals("Anne Arundel", customers.get(929).getCounty());
	}

	@Test
	@DisplayName("Record 930: State is MD")
	void StateOfRecord930() {
		assertEquals("MD", customers.get(929).getState());
	}

	@Test
	@DisplayName("Record 930: ZIP is 21401")
	void ZIPOfRecord930() {
		assertEquals("21401", customers.get(929).getZIP());
	}

	@Test
	@DisplayName("Record 930: Phone is 410-266-2157")
	void PhoneOfRecord930() {
		assertEquals("410-266-2157", customers.get(929).getPhone());
	}

	@Test
	@DisplayName("Record 930: Fax is 410-266-5227")
	void FaxOfRecord930() {
		assertEquals("410-266-5227", customers.get(929).getFax());
	}

	@Test
	@DisplayName("Record 930: Email is birdie@henschen.com")
	void EmailOfRecord930() {
		assertEquals("birdie@henschen.com", customers.get(929).getEmail());
	}

	@Test
	@DisplayName("Record 930: Web is http://www.birdiehenschen.com")
	void WebOfRecord930() {
		assertEquals("http://www.birdiehenschen.com", customers.get(929).getWeb());
	}
}
