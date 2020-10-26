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
class Record_1139 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1139: FirstName is Beatrice")
	void FirstNameOfRecord1139() {
		assertEquals("Beatrice", customers.get(1138).getFirstName());
	}

	@Test
	@DisplayName("Record 1139: LastName is Pinckney")
	void LastNameOfRecord1139() {
		assertEquals("Pinckney", customers.get(1138).getLastName());
	}

	@Test
	@DisplayName("Record 1139: Company is A & B Security")
	void CompanyOfRecord1139() {
		assertEquals("A & B Security", customers.get(1138).getCompany());
	}

	@Test
	@DisplayName("Record 1139: Address is 1230 Stambaugh Ave")
	void AddressOfRecord1139() {
		assertEquals("1230 Stambaugh Ave", customers.get(1138).getAddress());
	}

	@Test
	@DisplayName("Record 1139: City is Sharon")
	void CityOfRecord1139() {
		assertEquals("Sharon", customers.get(1138).getCity());
	}

	@Test
	@DisplayName("Record 1139: County is Mercer")
	void CountyOfRecord1139() {
		assertEquals("Mercer", customers.get(1138).getCounty());
	}

	@Test
	@DisplayName("Record 1139: State is PA")
	void StateOfRecord1139() {
		assertEquals("PA", customers.get(1138).getState());
	}

	@Test
	@DisplayName("Record 1139: ZIP is 16146")
	void ZIPOfRecord1139() {
		assertEquals("16146", customers.get(1138).getZIP());
	}

	@Test
	@DisplayName("Record 1139: Phone is 724-347-8512")
	void PhoneOfRecord1139() {
		assertEquals("724-347-8512", customers.get(1138).getPhone());
	}

	@Test
	@DisplayName("Record 1139: Fax is 724-347-4647")
	void FaxOfRecord1139() {
		assertEquals("724-347-4647", customers.get(1138).getFax());
	}

	@Test
	@DisplayName("Record 1139: Email is beatrice@pinckney.com")
	void EmailOfRecord1139() {
		assertEquals("beatrice@pinckney.com", customers.get(1138).getEmail());
	}

	@Test
	@DisplayName("Record 1139: Web is http://www.beatricepinckney.com")
	void WebOfRecord1139() {
		assertEquals("http://www.beatricepinckney.com", customers.get(1138).getWeb());
	}
}
