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

@Tag("11")
class Record_3851 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3851: FirstName is Marcel")
	void FirstNameOfRecord3851() {
		assertEquals("Marcel", customers.get(3850).getFirstName());
	}

	@Test
	@DisplayName("Record 3851: LastName is Gambaiani")
	void LastNameOfRecord3851() {
		assertEquals("Gambaiani", customers.get(3850).getLastName());
	}

	@Test
	@DisplayName("Record 3851: Company is T A C S")
	void CompanyOfRecord3851() {
		assertEquals("T A C S", customers.get(3850).getCompany());
	}

	@Test
	@DisplayName("Record 3851: Address is 625 Marquette Ave")
	void AddressOfRecord3851() {
		assertEquals("625 Marquette Ave", customers.get(3850).getAddress());
	}

	@Test
	@DisplayName("Record 3851: City is Minneapolis")
	void CityOfRecord3851() {
		assertEquals("Minneapolis", customers.get(3850).getCity());
	}

	@Test
	@DisplayName("Record 3851: County is Hennepin")
	void CountyOfRecord3851() {
		assertEquals("Hennepin", customers.get(3850).getCounty());
	}

	@Test
	@DisplayName("Record 3851: State is MN")
	void StateOfRecord3851() {
		assertEquals("MN", customers.get(3850).getState());
	}

	@Test
	@DisplayName("Record 3851: ZIP is 55402")
	void ZIPOfRecord3851() {
		assertEquals("55402", customers.get(3850).getZIP());
	}

	@Test
	@DisplayName("Record 3851: Phone is 612-342-7115")
	void PhoneOfRecord3851() {
		assertEquals("612-342-7115", customers.get(3850).getPhone());
	}

	@Test
	@DisplayName("Record 3851: Fax is 612-342-2761")
	void FaxOfRecord3851() {
		assertEquals("612-342-2761", customers.get(3850).getFax());
	}

	@Test
	@DisplayName("Record 3851: Email is marcel@gambaiani.com")
	void EmailOfRecord3851() {
		assertEquals("marcel@gambaiani.com", customers.get(3850).getEmail());
	}

	@Test
	@DisplayName("Record 3851: Web is http://www.marcelgambaiani.com")
	void WebOfRecord3851() {
		assertEquals("http://www.marcelgambaiani.com", customers.get(3850).getWeb());
	}
}
