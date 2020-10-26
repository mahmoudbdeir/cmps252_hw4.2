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
class Record_685 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 685: FirstName is Huey")
	void FirstNameOfRecord685() {
		assertEquals("Huey", customers.get(684).getFirstName());
	}

	@Test
	@DisplayName("Record 685: LastName is Longan")
	void LastNameOfRecord685() {
		assertEquals("Longan", customers.get(684).getLastName());
	}

	@Test
	@DisplayName("Record 685: Company is Prairielands Energy Mktng Inc")
	void CompanyOfRecord685() {
		assertEquals("Prairielands Energy Mktng Inc", customers.get(684).getCompany());
	}

	@Test
	@DisplayName("Record 685: Address is 1400 Washington St")
	void AddressOfRecord685() {
		assertEquals("1400 Washington St", customers.get(684).getAddress());
	}

	@Test
	@DisplayName("Record 685: City is Bakersfield")
	void CityOfRecord685() {
		assertEquals("Bakersfield", customers.get(684).getCity());
	}

	@Test
	@DisplayName("Record 685: County is Kern")
	void CountyOfRecord685() {
		assertEquals("Kern", customers.get(684).getCounty());
	}

	@Test
	@DisplayName("Record 685: State is CA")
	void StateOfRecord685() {
		assertEquals("CA", customers.get(684).getState());
	}

	@Test
	@DisplayName("Record 685: ZIP is 93305")
	void ZIPOfRecord685() {
		assertEquals("93305", customers.get(684).getZIP());
	}

	@Test
	@DisplayName("Record 685: Phone is 661-325-5273")
	void PhoneOfRecord685() {
		assertEquals("661-325-5273", customers.get(684).getPhone());
	}

	@Test
	@DisplayName("Record 685: Fax is 661-325-4589")
	void FaxOfRecord685() {
		assertEquals("661-325-4589", customers.get(684).getFax());
	}

	@Test
	@DisplayName("Record 685: Email is huey@longan.com")
	void EmailOfRecord685() {
		assertEquals("huey@longan.com", customers.get(684).getEmail());
	}

	@Test
	@DisplayName("Record 685: Web is http://www.hueylongan.com")
	void WebOfRecord685() {
		assertEquals("http://www.hueylongan.com", customers.get(684).getWeb());
	}
}
