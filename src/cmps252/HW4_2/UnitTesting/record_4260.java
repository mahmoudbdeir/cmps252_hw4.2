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

@Tag("45")
class Record_4260 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4260: FirstName is Trina")
	void FirstNameOfRecord4260() {
		assertEquals("Trina", customers.get(4259).getFirstName());
	}

	@Test
	@DisplayName("Record 4260: LastName is Keely")
	void LastNameOfRecord4260() {
		assertEquals("Keely", customers.get(4259).getLastName());
	}

	@Test
	@DisplayName("Record 4260: Company is Brofman, Michael D Esq")
	void CompanyOfRecord4260() {
		assertEquals("Brofman, Michael D Esq", customers.get(4259).getCompany());
	}

	@Test
	@DisplayName("Record 4260: Address is 1065 E Hillsdale Blvd  #-108")
	void AddressOfRecord4260() {
		assertEquals("1065 E Hillsdale Blvd  #-108", customers.get(4259).getAddress());
	}

	@Test
	@DisplayName("Record 4260: City is San Mateo")
	void CityOfRecord4260() {
		assertEquals("San Mateo", customers.get(4259).getCity());
	}

	@Test
	@DisplayName("Record 4260: County is San Mateo")
	void CountyOfRecord4260() {
		assertEquals("San Mateo", customers.get(4259).getCounty());
	}

	@Test
	@DisplayName("Record 4260: State is CA")
	void StateOfRecord4260() {
		assertEquals("CA", customers.get(4259).getState());
	}

	@Test
	@DisplayName("Record 4260: ZIP is 94404")
	void ZIPOfRecord4260() {
		assertEquals("94404", customers.get(4259).getZIP());
	}

	@Test
	@DisplayName("Record 4260: Phone is 650-348-6243")
	void PhoneOfRecord4260() {
		assertEquals("650-348-6243", customers.get(4259).getPhone());
	}

	@Test
	@DisplayName("Record 4260: Fax is 650-348-7637")
	void FaxOfRecord4260() {
		assertEquals("650-348-7637", customers.get(4259).getFax());
	}

	@Test
	@DisplayName("Record 4260: Email is trina@keely.com")
	void EmailOfRecord4260() {
		assertEquals("trina@keely.com", customers.get(4259).getEmail());
	}

	@Test
	@DisplayName("Record 4260: Web is http://www.trinakeely.com")
	void WebOfRecord4260() {
		assertEquals("http://www.trinakeely.com", customers.get(4259).getWeb());
	}
}
