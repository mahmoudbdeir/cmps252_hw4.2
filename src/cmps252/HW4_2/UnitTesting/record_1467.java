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

@Tag("39")
class Record_1467 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1467: FirstName is Cathleen")
	void FirstNameOfRecord1467() {
		assertEquals("Cathleen", customers.get(1466).getFirstName());
	}

	@Test
	@DisplayName("Record 1467: LastName is Debouse")
	void LastNameOfRecord1467() {
		assertEquals("Debouse", customers.get(1466).getLastName());
	}

	@Test
	@DisplayName("Record 1467: Company is Gimmel Wyman Ersek & Blomberg")
	void CompanyOfRecord1467() {
		assertEquals("Gimmel Wyman Ersek & Blomberg", customers.get(1466).getCompany());
	}

	@Test
	@DisplayName("Record 1467: Address is 13909 Poway Rd")
	void AddressOfRecord1467() {
		assertEquals("13909 Poway Rd", customers.get(1466).getAddress());
	}

	@Test
	@DisplayName("Record 1467: City is Poway")
	void CityOfRecord1467() {
		assertEquals("Poway", customers.get(1466).getCity());
	}

	@Test
	@DisplayName("Record 1467: County is San Diego")
	void CountyOfRecord1467() {
		assertEquals("San Diego", customers.get(1466).getCounty());
	}

	@Test
	@DisplayName("Record 1467: State is CA")
	void StateOfRecord1467() {
		assertEquals("CA", customers.get(1466).getState());
	}

	@Test
	@DisplayName("Record 1467: ZIP is 92064")
	void ZIPOfRecord1467() {
		assertEquals("92064", customers.get(1466).getZIP());
	}

	@Test
	@DisplayName("Record 1467: Phone is 858-578-8368")
	void PhoneOfRecord1467() {
		assertEquals("858-578-8368", customers.get(1466).getPhone());
	}

	@Test
	@DisplayName("Record 1467: Fax is 858-578-6628")
	void FaxOfRecord1467() {
		assertEquals("858-578-6628", customers.get(1466).getFax());
	}

	@Test
	@DisplayName("Record 1467: Email is cathleen@debouse.com")
	void EmailOfRecord1467() {
		assertEquals("cathleen@debouse.com", customers.get(1466).getEmail());
	}

	@Test
	@DisplayName("Record 1467: Web is http://www.cathleendebouse.com")
	void WebOfRecord1467() {
		assertEquals("http://www.cathleendebouse.com", customers.get(1466).getWeb());
	}
}
