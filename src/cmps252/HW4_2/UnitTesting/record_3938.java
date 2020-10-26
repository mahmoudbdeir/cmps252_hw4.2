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

@Tag("8")
class Record_3938 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3938: FirstName is Aida")
	void FirstNameOfRecord3938() {
		assertEquals("Aida", customers.get(3937).getFirstName());
	}

	@Test
	@DisplayName("Record 3938: LastName is Fooks")
	void LastNameOfRecord3938() {
		assertEquals("Fooks", customers.get(3937).getLastName());
	}

	@Test
	@DisplayName("Record 3938: Company is Carters Heating & Cooling")
	void CompanyOfRecord3938() {
		assertEquals("Carters Heating & Cooling", customers.get(3937).getCompany());
	}

	@Test
	@DisplayName("Record 3938: Address is 265 Winn St")
	void AddressOfRecord3938() {
		assertEquals("265 Winn St", customers.get(3937).getAddress());
	}

	@Test
	@DisplayName("Record 3938: City is Burlington")
	void CityOfRecord3938() {
		assertEquals("Burlington", customers.get(3937).getCity());
	}

	@Test
	@DisplayName("Record 3938: County is Middlesex")
	void CountyOfRecord3938() {
		assertEquals("Middlesex", customers.get(3937).getCounty());
	}

	@Test
	@DisplayName("Record 3938: State is MA")
	void StateOfRecord3938() {
		assertEquals("MA", customers.get(3937).getState());
	}

	@Test
	@DisplayName("Record 3938: ZIP is 1803")
	void ZIPOfRecord3938() {
		assertEquals("1803", customers.get(3937).getZIP());
	}

	@Test
	@DisplayName("Record 3938: Phone is 781-273-7856")
	void PhoneOfRecord3938() {
		assertEquals("781-273-7856", customers.get(3937).getPhone());
	}

	@Test
	@DisplayName("Record 3938: Fax is 781-273-3184")
	void FaxOfRecord3938() {
		assertEquals("781-273-3184", customers.get(3937).getFax());
	}

	@Test
	@DisplayName("Record 3938: Email is aida@fooks.com")
	void EmailOfRecord3938() {
		assertEquals("aida@fooks.com", customers.get(3937).getEmail());
	}

	@Test
	@DisplayName("Record 3938: Web is http://www.aidafooks.com")
	void WebOfRecord3938() {
		assertEquals("http://www.aidafooks.com", customers.get(3937).getWeb());
	}
}
