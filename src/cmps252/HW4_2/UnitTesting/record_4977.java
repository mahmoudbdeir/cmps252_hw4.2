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
class Record_4977 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4977: FirstName is Oscar")
	void FirstNameOfRecord4977() {
		assertEquals("Oscar", customers.get(4976).getFirstName());
	}

	@Test
	@DisplayName("Record 4977: LastName is Haseloff")
	void LastNameOfRecord4977() {
		assertEquals("Haseloff", customers.get(4976).getLastName());
	}

	@Test
	@DisplayName("Record 4977: Company is Devlin, John Esq")
	void CompanyOfRecord4977() {
		assertEquals("Devlin, John Esq", customers.get(4976).getCompany());
	}

	@Test
	@DisplayName("Record 4977: Address is 721 56th Ave")
	void AddressOfRecord4977() {
		assertEquals("721 56th Ave", customers.get(4976).getAddress());
	}

	@Test
	@DisplayName("Record 4977: City is Meridian")
	void CityOfRecord4977() {
		assertEquals("Meridian", customers.get(4976).getCity());
	}

	@Test
	@DisplayName("Record 4977: County is Lauderdale")
	void CountyOfRecord4977() {
		assertEquals("Lauderdale", customers.get(4976).getCounty());
	}

	@Test
	@DisplayName("Record 4977: State is MS")
	void StateOfRecord4977() {
		assertEquals("MS", customers.get(4976).getState());
	}

	@Test
	@DisplayName("Record 4977: ZIP is 39307")
	void ZIPOfRecord4977() {
		assertEquals("39307", customers.get(4976).getZIP());
	}

	@Test
	@DisplayName("Record 4977: Phone is 601-483-4166")
	void PhoneOfRecord4977() {
		assertEquals("601-483-4166", customers.get(4976).getPhone());
	}

	@Test
	@DisplayName("Record 4977: Fax is 601-483-9125")
	void FaxOfRecord4977() {
		assertEquals("601-483-9125", customers.get(4976).getFax());
	}

	@Test
	@DisplayName("Record 4977: Email is oscar@haseloff.com")
	void EmailOfRecord4977() {
		assertEquals("oscar@haseloff.com", customers.get(4976).getEmail());
	}

	@Test
	@DisplayName("Record 4977: Web is http://www.oscarhaseloff.com")
	void WebOfRecord4977() {
		assertEquals("http://www.oscarhaseloff.com", customers.get(4976).getWeb());
	}
}
