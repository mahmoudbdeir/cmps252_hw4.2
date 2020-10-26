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

@Tag("46")
class Record_2794 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2794: FirstName is Georgia")
	void FirstNameOfRecord2794() {
		assertEquals("Georgia", customers.get(2793).getFirstName());
	}

	@Test
	@DisplayName("Record 2794: LastName is Bui")
	void LastNameOfRecord2794() {
		assertEquals("Bui", customers.get(2793).getLastName());
	}

	@Test
	@DisplayName("Record 2794: Company is Walsh, Joseph M Iii")
	void CompanyOfRecord2794() {
		assertEquals("Walsh, Joseph M Iii", customers.get(2793).getCompany());
	}

	@Test
	@DisplayName("Record 2794: Address is 746 Bannister St")
	void AddressOfRecord2794() {
		assertEquals("746 Bannister St", customers.get(2793).getAddress());
	}

	@Test
	@DisplayName("Record 2794: City is Honolulu")
	void CityOfRecord2794() {
		assertEquals("Honolulu", customers.get(2793).getCity());
	}

	@Test
	@DisplayName("Record 2794: County is Honolulu")
	void CountyOfRecord2794() {
		assertEquals("Honolulu", customers.get(2793).getCounty());
	}

	@Test
	@DisplayName("Record 2794: State is HI")
	void StateOfRecord2794() {
		assertEquals("HI", customers.get(2793).getState());
	}

	@Test
	@DisplayName("Record 2794: ZIP is 96819")
	void ZIPOfRecord2794() {
		assertEquals("96819", customers.get(2793).getZIP());
	}

	@Test
	@DisplayName("Record 2794: Phone is 808-845-4680")
	void PhoneOfRecord2794() {
		assertEquals("808-845-4680", customers.get(2793).getPhone());
	}

	@Test
	@DisplayName("Record 2794: Fax is 808-845-8553")
	void FaxOfRecord2794() {
		assertEquals("808-845-8553", customers.get(2793).getFax());
	}

	@Test
	@DisplayName("Record 2794: Email is georgia@bui.com")
	void EmailOfRecord2794() {
		assertEquals("georgia@bui.com", customers.get(2793).getEmail());
	}

	@Test
	@DisplayName("Record 2794: Web is http://www.georgiabui.com")
	void WebOfRecord2794() {
		assertEquals("http://www.georgiabui.com", customers.get(2793).getWeb());
	}
}
