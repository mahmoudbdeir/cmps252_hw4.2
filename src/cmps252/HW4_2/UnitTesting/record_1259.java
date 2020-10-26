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

@Tag("13")
class Record_1259 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1259: FirstName is Neva")
	void FirstNameOfRecord1259() {
		assertEquals("Neva", customers.get(1258).getFirstName());
	}

	@Test
	@DisplayName("Record 1259: LastName is Sow")
	void LastNameOfRecord1259() {
		assertEquals("Sow", customers.get(1258).getLastName());
	}

	@Test
	@DisplayName("Record 1259: Company is Thiel Tool & Engrg Co Inc")
	void CompanyOfRecord1259() {
		assertEquals("Thiel Tool & Engrg Co Inc", customers.get(1258).getCompany());
	}

	@Test
	@DisplayName("Record 1259: Address is 1045 Air Way")
	void AddressOfRecord1259() {
		assertEquals("1045 Air Way", customers.get(1258).getAddress());
	}

	@Test
	@DisplayName("Record 1259: City is Glendale")
	void CityOfRecord1259() {
		assertEquals("Glendale", customers.get(1258).getCity());
	}

	@Test
	@DisplayName("Record 1259: County is Los Angeles")
	void CountyOfRecord1259() {
		assertEquals("Los Angeles", customers.get(1258).getCounty());
	}

	@Test
	@DisplayName("Record 1259: State is CA")
	void StateOfRecord1259() {
		assertEquals("CA", customers.get(1258).getState());
	}

	@Test
	@DisplayName("Record 1259: ZIP is 91201")
	void ZIPOfRecord1259() {
		assertEquals("91201", customers.get(1258).getZIP());
	}

	@Test
	@DisplayName("Record 1259: Phone is 818-243-2341")
	void PhoneOfRecord1259() {
		assertEquals("818-243-2341", customers.get(1258).getPhone());
	}

	@Test
	@DisplayName("Record 1259: Fax is 818-243-7791")
	void FaxOfRecord1259() {
		assertEquals("818-243-7791", customers.get(1258).getFax());
	}

	@Test
	@DisplayName("Record 1259: Email is neva@sow.com")
	void EmailOfRecord1259() {
		assertEquals("neva@sow.com", customers.get(1258).getEmail());
	}

	@Test
	@DisplayName("Record 1259: Web is http://www.nevasow.com")
	void WebOfRecord1259() {
		assertEquals("http://www.nevasow.com", customers.get(1258).getWeb());
	}
}
