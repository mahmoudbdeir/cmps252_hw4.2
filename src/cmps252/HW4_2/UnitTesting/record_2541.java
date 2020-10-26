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

@Tag("17")
class Record_2541 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2541: FirstName is Tyron")
	void FirstNameOfRecord2541() {
		assertEquals("Tyron", customers.get(2540).getFirstName());
	}

	@Test
	@DisplayName("Record 2541: LastName is Syver")
	void LastNameOfRecord2541() {
		assertEquals("Syver", customers.get(2540).getLastName());
	}

	@Test
	@DisplayName("Record 2541: Company is Ill Co Inc")
	void CompanyOfRecord2541() {
		assertEquals("Ill Co Inc", customers.get(2540).getCompany());
	}

	@Test
	@DisplayName("Record 2541: Address is 6212 Executive Blvd")
	void AddressOfRecord2541() {
		assertEquals("6212 Executive Blvd", customers.get(2540).getAddress());
	}

	@Test
	@DisplayName("Record 2541: City is Dayton")
	void CityOfRecord2541() {
		assertEquals("Dayton", customers.get(2540).getCity());
	}

	@Test
	@DisplayName("Record 2541: County is Montgomery")
	void CountyOfRecord2541() {
		assertEquals("Montgomery", customers.get(2540).getCounty());
	}

	@Test
	@DisplayName("Record 2541: State is OH")
	void StateOfRecord2541() {
		assertEquals("OH", customers.get(2540).getState());
	}

	@Test
	@DisplayName("Record 2541: ZIP is 45424")
	void ZIPOfRecord2541() {
		assertEquals("45424", customers.get(2540).getZIP());
	}

	@Test
	@DisplayName("Record 2541: Phone is 937-233-0900")
	void PhoneOfRecord2541() {
		assertEquals("937-233-0900", customers.get(2540).getPhone());
	}

	@Test
	@DisplayName("Record 2541: Fax is 937-233-1322")
	void FaxOfRecord2541() {
		assertEquals("937-233-1322", customers.get(2540).getFax());
	}

	@Test
	@DisplayName("Record 2541: Email is tyron@syver.com")
	void EmailOfRecord2541() {
		assertEquals("tyron@syver.com", customers.get(2540).getEmail());
	}

	@Test
	@DisplayName("Record 2541: Web is http://www.tyronsyver.com")
	void WebOfRecord2541() {
		assertEquals("http://www.tyronsyver.com", customers.get(2540).getWeb());
	}
}
