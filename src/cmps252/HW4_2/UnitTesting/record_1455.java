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
class Record_1455 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1455: FirstName is Ike")
	void FirstNameOfRecord1455() {
		assertEquals("Ike", customers.get(1454).getFirstName());
	}

	@Test
	@DisplayName("Record 1455: LastName is Morgret")
	void LastNameOfRecord1455() {
		assertEquals("Morgret", customers.get(1454).getLastName());
	}

	@Test
	@DisplayName("Record 1455: Company is Laurel Printing & Copy")
	void CompanyOfRecord1455() {
		assertEquals("Laurel Printing & Copy", customers.get(1454).getCompany());
	}

	@Test
	@DisplayName("Record 1455: Address is Rr 1")
	void AddressOfRecord1455() {
		assertEquals("Rr 1", customers.get(1454).getAddress());
	}

	@Test
	@DisplayName("Record 1455: City is Mc Minnville")
	void CityOfRecord1455() {
		assertEquals("Mc Minnville", customers.get(1454).getCity());
	}

	@Test
	@DisplayName("Record 1455: County is Warren")
	void CountyOfRecord1455() {
		assertEquals("Warren", customers.get(1454).getCounty());
	}

	@Test
	@DisplayName("Record 1455: State is TN")
	void StateOfRecord1455() {
		assertEquals("TN", customers.get(1454).getState());
	}

	@Test
	@DisplayName("Record 1455: ZIP is 37110")
	void ZIPOfRecord1455() {
		assertEquals("37110", customers.get(1454).getZIP());
	}

	@Test
	@DisplayName("Record 1455: Phone is 931-668-4813")
	void PhoneOfRecord1455() {
		assertEquals("931-668-4813", customers.get(1454).getPhone());
	}

	@Test
	@DisplayName("Record 1455: Fax is 931-668-6594")
	void FaxOfRecord1455() {
		assertEquals("931-668-6594", customers.get(1454).getFax());
	}

	@Test
	@DisplayName("Record 1455: Email is ike@morgret.com")
	void EmailOfRecord1455() {
		assertEquals("ike@morgret.com", customers.get(1454).getEmail());
	}

	@Test
	@DisplayName("Record 1455: Web is http://www.ikemorgret.com")
	void WebOfRecord1455() {
		assertEquals("http://www.ikemorgret.com", customers.get(1454).getWeb());
	}
}
