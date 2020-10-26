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

@Tag("18")
class Record_3103 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3103: FirstName is Winford")
	void FirstNameOfRecord3103() {
		assertEquals("Winford", customers.get(3102).getFirstName());
	}

	@Test
	@DisplayName("Record 3103: LastName is Daidone")
	void LastNameOfRecord3103() {
		assertEquals("Daidone", customers.get(3102).getLastName());
	}

	@Test
	@DisplayName("Record 3103: Company is Renee S Frankel")
	void CompanyOfRecord3103() {
		assertEquals("Renee S Frankel", customers.get(3102).getCompany());
	}

	@Test
	@DisplayName("Record 3103: Address is 1035 N Washington Ave")
	void AddressOfRecord3103() {
		assertEquals("1035 N Washington Ave", customers.get(3102).getAddress());
	}

	@Test
	@DisplayName("Record 3103: City is Scranton")
	void CityOfRecord3103() {
		assertEquals("Scranton", customers.get(3102).getCity());
	}

	@Test
	@DisplayName("Record 3103: County is Lackawanna")
	void CountyOfRecord3103() {
		assertEquals("Lackawanna", customers.get(3102).getCounty());
	}

	@Test
	@DisplayName("Record 3103: State is PA")
	void StateOfRecord3103() {
		assertEquals("PA", customers.get(3102).getState());
	}

	@Test
	@DisplayName("Record 3103: ZIP is 18509")
	void ZIPOfRecord3103() {
		assertEquals("18509", customers.get(3102).getZIP());
	}

	@Test
	@DisplayName("Record 3103: Phone is 570-348-3236")
	void PhoneOfRecord3103() {
		assertEquals("570-348-3236", customers.get(3102).getPhone());
	}

	@Test
	@DisplayName("Record 3103: Fax is 570-348-9372")
	void FaxOfRecord3103() {
		assertEquals("570-348-9372", customers.get(3102).getFax());
	}

	@Test
	@DisplayName("Record 3103: Email is winford@daidone.com")
	void EmailOfRecord3103() {
		assertEquals("winford@daidone.com", customers.get(3102).getEmail());
	}

	@Test
	@DisplayName("Record 3103: Web is http://www.winforddaidone.com")
	void WebOfRecord3103() {
		assertEquals("http://www.winforddaidone.com", customers.get(3102).getWeb());
	}
}
