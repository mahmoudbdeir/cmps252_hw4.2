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

@Tag("37")
class Record_1382 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1382: FirstName is Iona")
	void FirstNameOfRecord1382() {
		assertEquals("Iona", customers.get(1381).getFirstName());
	}

	@Test
	@DisplayName("Record 1382: LastName is Capinpin")
	void LastNameOfRecord1382() {
		assertEquals("Capinpin", customers.get(1381).getLastName());
	}

	@Test
	@DisplayName("Record 1382: Company is Stromberg, Jeffrey T Esq")
	void CompanyOfRecord1382() {
		assertEquals("Stromberg, Jeffrey T Esq", customers.get(1381).getCompany());
	}

	@Test
	@DisplayName("Record 1382: Address is 8220 W Sleske Ct")
	void AddressOfRecord1382() {
		assertEquals("8220 W Sleske Ct", customers.get(1381).getAddress());
	}

	@Test
	@DisplayName("Record 1382: City is Milwaukee")
	void CityOfRecord1382() {
		assertEquals("Milwaukee", customers.get(1381).getCity());
	}

	@Test
	@DisplayName("Record 1382: County is Milwaukee")
	void CountyOfRecord1382() {
		assertEquals("Milwaukee", customers.get(1381).getCounty());
	}

	@Test
	@DisplayName("Record 1382: State is WI")
	void StateOfRecord1382() {
		assertEquals("WI", customers.get(1381).getState());
	}

	@Test
	@DisplayName("Record 1382: ZIP is 53223")
	void ZIPOfRecord1382() {
		assertEquals("53223", customers.get(1381).getZIP());
	}

	@Test
	@DisplayName("Record 1382: Phone is 414-357-4947")
	void PhoneOfRecord1382() {
		assertEquals("414-357-4947", customers.get(1381).getPhone());
	}

	@Test
	@DisplayName("Record 1382: Fax is 414-357-4607")
	void FaxOfRecord1382() {
		assertEquals("414-357-4607", customers.get(1381).getFax());
	}

	@Test
	@DisplayName("Record 1382: Email is iona@capinpin.com")
	void EmailOfRecord1382() {
		assertEquals("iona@capinpin.com", customers.get(1381).getEmail());
	}

	@Test
	@DisplayName("Record 1382: Web is http://www.ionacapinpin.com")
	void WebOfRecord1382() {
		assertEquals("http://www.ionacapinpin.com", customers.get(1381).getWeb());
	}
}
