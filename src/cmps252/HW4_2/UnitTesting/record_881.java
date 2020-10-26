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

@Tag("20")
class Record_881 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 881: FirstName is Krystle")
	void FirstNameOfRecord881() {
		assertEquals("Krystle", customers.get(880).getFirstName());
	}

	@Test
	@DisplayName("Record 881: LastName is Kanzenbach")
	void LastNameOfRecord881() {
		assertEquals("Kanzenbach", customers.get(880).getLastName());
	}

	@Test
	@DisplayName("Record 881: Company is Medco Drugs")
	void CompanyOfRecord881() {
		assertEquals("Medco Drugs", customers.get(880).getCompany());
	}

	@Test
	@DisplayName("Record 881: Address is 300 6th St")
	void AddressOfRecord881() {
		assertEquals("300 6th St", customers.get(880).getAddress());
	}

	@Test
	@DisplayName("Record 881: City is Kiel")
	void CityOfRecord881() {
		assertEquals("Kiel", customers.get(880).getCity());
	}

	@Test
	@DisplayName("Record 881: County is Manitowoc")
	void CountyOfRecord881() {
		assertEquals("Manitowoc", customers.get(880).getCounty());
	}

	@Test
	@DisplayName("Record 881: State is WI")
	void StateOfRecord881() {
		assertEquals("WI", customers.get(880).getState());
	}

	@Test
	@DisplayName("Record 881: ZIP is 53042")
	void ZIPOfRecord881() {
		assertEquals("53042", customers.get(880).getZIP());
	}

	@Test
	@DisplayName("Record 881: Phone is 920-892-8885")
	void PhoneOfRecord881() {
		assertEquals("920-892-8885", customers.get(880).getPhone());
	}

	@Test
	@DisplayName("Record 881: Fax is 920-892-6777")
	void FaxOfRecord881() {
		assertEquals("920-892-6777", customers.get(880).getFax());
	}

	@Test
	@DisplayName("Record 881: Email is krystle@kanzenbach.com")
	void EmailOfRecord881() {
		assertEquals("krystle@kanzenbach.com", customers.get(880).getEmail());
	}

	@Test
	@DisplayName("Record 881: Web is http://www.krystlekanzenbach.com")
	void WebOfRecord881() {
		assertEquals("http://www.krystlekanzenbach.com", customers.get(880).getWeb());
	}
}
