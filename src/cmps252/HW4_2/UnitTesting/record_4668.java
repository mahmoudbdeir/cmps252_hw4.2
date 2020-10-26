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
class Record_4668 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4668: FirstName is Gracie")
	void FirstNameOfRecord4668() {
		assertEquals("Gracie", customers.get(4667).getFirstName());
	}

	@Test
	@DisplayName("Record 4668: LastName is Hardnette")
	void LastNameOfRecord4668() {
		assertEquals("Hardnette", customers.get(4667).getLastName());
	}

	@Test
	@DisplayName("Record 4668: Company is Cargill Salt")
	void CompanyOfRecord4668() {
		assertEquals("Cargill Salt", customers.get(4667).getCompany());
	}

	@Test
	@DisplayName("Record 4668: Address is 180 White Rd")
	void AddressOfRecord4668() {
		assertEquals("180 White Rd", customers.get(4667).getAddress());
	}

	@Test
	@DisplayName("Record 4668: City is Little Silver")
	void CityOfRecord4668() {
		assertEquals("Little Silver", customers.get(4667).getCity());
	}

	@Test
	@DisplayName("Record 4668: County is Monmouth")
	void CountyOfRecord4668() {
		assertEquals("Monmouth", customers.get(4667).getCounty());
	}

	@Test
	@DisplayName("Record 4668: State is NJ")
	void StateOfRecord4668() {
		assertEquals("NJ", customers.get(4667).getState());
	}

	@Test
	@DisplayName("Record 4668: ZIP is 7739")
	void ZIPOfRecord4668() {
		assertEquals("7739", customers.get(4667).getZIP());
	}

	@Test
	@DisplayName("Record 4668: Phone is 732-741-2022")
	void PhoneOfRecord4668() {
		assertEquals("732-741-2022", customers.get(4667).getPhone());
	}

	@Test
	@DisplayName("Record 4668: Fax is 732-741-7515")
	void FaxOfRecord4668() {
		assertEquals("732-741-7515", customers.get(4667).getFax());
	}

	@Test
	@DisplayName("Record 4668: Email is gracie@hardnette.com")
	void EmailOfRecord4668() {
		assertEquals("gracie@hardnette.com", customers.get(4667).getEmail());
	}

	@Test
	@DisplayName("Record 4668: Web is http://www.graciehardnette.com")
	void WebOfRecord4668() {
		assertEquals("http://www.graciehardnette.com", customers.get(4667).getWeb());
	}
}
