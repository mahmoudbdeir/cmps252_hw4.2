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

@Tag("33")
class Record_2000 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2000: FirstName is Gloria")
	void FirstNameOfRecord2000() {
		assertEquals("Gloria", customers.get(1999).getFirstName());
	}

	@Test
	@DisplayName("Record 2000: LastName is Sikat")
	void LastNameOfRecord2000() {
		assertEquals("Sikat", customers.get(1999).getLastName());
	}

	@Test
	@DisplayName("Record 2000: Company is Econo Lodge")
	void CompanyOfRecord2000() {
		assertEquals("Econo Lodge", customers.get(1999).getCompany());
	}

	@Test
	@DisplayName("Record 2000: Address is 300 S Rodney Parham Rd")
	void AddressOfRecord2000() {
		assertEquals("300 S Rodney Parham Rd", customers.get(1999).getAddress());
	}

	@Test
	@DisplayName("Record 2000: City is Little Rock")
	void CityOfRecord2000() {
		assertEquals("Little Rock", customers.get(1999).getCity());
	}

	@Test
	@DisplayName("Record 2000: County is Pulaski")
	void CountyOfRecord2000() {
		assertEquals("Pulaski", customers.get(1999).getCounty());
	}

	@Test
	@DisplayName("Record 2000: State is AR")
	void StateOfRecord2000() {
		assertEquals("AR", customers.get(1999).getState());
	}

	@Test
	@DisplayName("Record 2000: ZIP is 72205")
	void ZIPOfRecord2000() {
		assertEquals("72205", customers.get(1999).getZIP());
	}

	@Test
	@DisplayName("Record 2000: Phone is 501-224-6172")
	void PhoneOfRecord2000() {
		assertEquals("501-224-6172", customers.get(1999).getPhone());
	}

	@Test
	@DisplayName("Record 2000: Fax is 501-224-4399")
	void FaxOfRecord2000() {
		assertEquals("501-224-4399", customers.get(1999).getFax());
	}

	@Test
	@DisplayName("Record 2000: Email is gloria@sikat.com")
	void EmailOfRecord2000() {
		assertEquals("gloria@sikat.com", customers.get(1999).getEmail());
	}

	@Test
	@DisplayName("Record 2000: Web is http://www.gloriasikat.com")
	void WebOfRecord2000() {
		assertEquals("http://www.gloriasikat.com", customers.get(1999).getWeb());
	}
}
