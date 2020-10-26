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

@Tag("38")
class Record_4438 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4438: FirstName is Clayton")
	void FirstNameOfRecord4438() {
		assertEquals("Clayton", customers.get(4437).getFirstName());
	}

	@Test
	@DisplayName("Record 4438: LastName is Nunoz")
	void LastNameOfRecord4438() {
		assertEquals("Nunoz", customers.get(4437).getLastName());
	}

	@Test
	@DisplayName("Record 4438: Company is Lemkin, Susan")
	void CompanyOfRecord4438() {
		assertEquals("Lemkin, Susan", customers.get(4437).getCompany());
	}

	@Test
	@DisplayName("Record 4438: Address is 8121 Shaw Rd E")
	void AddressOfRecord4438() {
		assertEquals("8121 Shaw Rd E", customers.get(4437).getAddress());
	}

	@Test
	@DisplayName("Record 4438: City is Puyallup")
	void CityOfRecord4438() {
		assertEquals("Puyallup", customers.get(4437).getCity());
	}

	@Test
	@DisplayName("Record 4438: County is Pierce")
	void CountyOfRecord4438() {
		assertEquals("Pierce", customers.get(4437).getCounty());
	}

	@Test
	@DisplayName("Record 4438: State is WA")
	void StateOfRecord4438() {
		assertEquals("WA", customers.get(4437).getState());
	}

	@Test
	@DisplayName("Record 4438: ZIP is 98372")
	void ZIPOfRecord4438() {
		assertEquals("98372", customers.get(4437).getZIP());
	}

	@Test
	@DisplayName("Record 4438: Phone is 253-841-5464")
	void PhoneOfRecord4438() {
		assertEquals("253-841-5464", customers.get(4437).getPhone());
	}

	@Test
	@DisplayName("Record 4438: Fax is 253-841-1946")
	void FaxOfRecord4438() {
		assertEquals("253-841-1946", customers.get(4437).getFax());
	}

	@Test
	@DisplayName("Record 4438: Email is clayton@nunoz.com")
	void EmailOfRecord4438() {
		assertEquals("clayton@nunoz.com", customers.get(4437).getEmail());
	}

	@Test
	@DisplayName("Record 4438: Web is http://www.claytonnunoz.com")
	void WebOfRecord4438() {
		assertEquals("http://www.claytonnunoz.com", customers.get(4437).getWeb());
	}
}
