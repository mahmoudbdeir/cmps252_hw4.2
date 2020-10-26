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

@Tag("10")
class Record_4333 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4333: FirstName is Amie")
	void FirstNameOfRecord4333() {
		assertEquals("Amie", customers.get(4332).getFirstName());
	}

	@Test
	@DisplayName("Record 4333: LastName is Cecilio")
	void LastNameOfRecord4333() {
		assertEquals("Cecilio", customers.get(4332).getLastName());
	}

	@Test
	@DisplayName("Record 4333: Company is B & A Friction Materials Inc")
	void CompanyOfRecord4333() {
		assertEquals("B & A Friction Materials Inc", customers.get(4332).getCompany());
	}

	@Test
	@DisplayName("Record 4333: Address is 5333 Mcauley Dr")
	void AddressOfRecord4333() {
		assertEquals("5333 Mcauley Dr", customers.get(4332).getAddress());
	}

	@Test
	@DisplayName("Record 4333: City is Ypsilanti")
	void CityOfRecord4333() {
		assertEquals("Ypsilanti", customers.get(4332).getCity());
	}

	@Test
	@DisplayName("Record 4333: County is Washtenaw")
	void CountyOfRecord4333() {
		assertEquals("Washtenaw", customers.get(4332).getCounty());
	}

	@Test
	@DisplayName("Record 4333: State is MI")
	void StateOfRecord4333() {
		assertEquals("MI", customers.get(4332).getState());
	}

	@Test
	@DisplayName("Record 4333: ZIP is 48197")
	void ZIPOfRecord4333() {
		assertEquals("48197", customers.get(4332).getZIP());
	}

	@Test
	@DisplayName("Record 4333: Phone is 734-572-9571")
	void PhoneOfRecord4333() {
		assertEquals("734-572-9571", customers.get(4332).getPhone());
	}

	@Test
	@DisplayName("Record 4333: Fax is 734-572-9157")
	void FaxOfRecord4333() {
		assertEquals("734-572-9157", customers.get(4332).getFax());
	}

	@Test
	@DisplayName("Record 4333: Email is amie@cecilio.com")
	void EmailOfRecord4333() {
		assertEquals("amie@cecilio.com", customers.get(4332).getEmail());
	}

	@Test
	@DisplayName("Record 4333: Web is http://www.amiececilio.com")
	void WebOfRecord4333() {
		assertEquals("http://www.amiececilio.com", customers.get(4332).getWeb());
	}
}
