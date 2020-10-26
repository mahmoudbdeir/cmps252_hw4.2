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

@Tag("25")
class Record_787 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 787: FirstName is Yesenia")
	void FirstNameOfRecord787() {
		assertEquals("Yesenia", customers.get(786).getFirstName());
	}

	@Test
	@DisplayName("Record 787: LastName is Cease")
	void LastNameOfRecord787() {
		assertEquals("Cease", customers.get(786).getLastName());
	}

	@Test
	@DisplayName("Record 787: Company is Knight Marketing Corp")
	void CompanyOfRecord787() {
		assertEquals("Knight Marketing Corp", customers.get(786).getCompany());
	}

	@Test
	@DisplayName("Record 787: Address is 708 S Pierce St")
	void AddressOfRecord787() {
		assertEquals("708 S Pierce St", customers.get(786).getAddress());
	}

	@Test
	@DisplayName("Record 787: City is Burnet")
	void CityOfRecord787() {
		assertEquals("Burnet", customers.get(786).getCity());
	}

	@Test
	@DisplayName("Record 787: County is Burnet")
	void CountyOfRecord787() {
		assertEquals("Burnet", customers.get(786).getCounty());
	}

	@Test
	@DisplayName("Record 787: State is TX")
	void StateOfRecord787() {
		assertEquals("TX", customers.get(786).getState());
	}

	@Test
	@DisplayName("Record 787: ZIP is 78611")
	void ZIPOfRecord787() {
		assertEquals("78611", customers.get(786).getZIP());
	}

	@Test
	@DisplayName("Record 787: Phone is 512-756-3770")
	void PhoneOfRecord787() {
		assertEquals("512-756-3770", customers.get(786).getPhone());
	}

	@Test
	@DisplayName("Record 787: Fax is 512-756-9759")
	void FaxOfRecord787() {
		assertEquals("512-756-9759", customers.get(786).getFax());
	}

	@Test
	@DisplayName("Record 787: Email is yesenia@cease.com")
	void EmailOfRecord787() {
		assertEquals("yesenia@cease.com", customers.get(786).getEmail());
	}

	@Test
	@DisplayName("Record 787: Web is http://www.yeseniacease.com")
	void WebOfRecord787() {
		assertEquals("http://www.yeseniacease.com", customers.get(786).getWeb());
	}
}
