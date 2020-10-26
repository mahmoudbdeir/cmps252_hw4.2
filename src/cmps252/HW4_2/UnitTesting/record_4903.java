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

@Tag("26")
class Record_4903 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4903: FirstName is Brain")
	void FirstNameOfRecord4903() {
		assertEquals("Brain", customers.get(4902).getFirstName());
	}

	@Test
	@DisplayName("Record 4903: LastName is Pia")
	void LastNameOfRecord4903() {
		assertEquals("Pia", customers.get(4902).getLastName());
	}

	@Test
	@DisplayName("Record 4903: Company is Intrntl Shipg Wld Wide Elec")
	void CompanyOfRecord4903() {
		assertEquals("Intrntl Shipg Wld Wide Elec", customers.get(4902).getCompany());
	}

	@Test
	@DisplayName("Record 4903: Address is 135 Bloomfield Ave")
	void AddressOfRecord4903() {
		assertEquals("135 Bloomfield Ave", customers.get(4902).getAddress());
	}

	@Test
	@DisplayName("Record 4903: City is Bloomfield")
	void CityOfRecord4903() {
		assertEquals("Bloomfield", customers.get(4902).getCity());
	}

	@Test
	@DisplayName("Record 4903: County is Essex")
	void CountyOfRecord4903() {
		assertEquals("Essex", customers.get(4902).getCounty());
	}

	@Test
	@DisplayName("Record 4903: State is NJ")
	void StateOfRecord4903() {
		assertEquals("NJ", customers.get(4902).getState());
	}

	@Test
	@DisplayName("Record 4903: ZIP is 7003")
	void ZIPOfRecord4903() {
		assertEquals("7003", customers.get(4902).getZIP());
	}

	@Test
	@DisplayName("Record 4903: Phone is 973-429-0823")
	void PhoneOfRecord4903() {
		assertEquals("973-429-0823", customers.get(4902).getPhone());
	}

	@Test
	@DisplayName("Record 4903: Fax is 973-429-9991")
	void FaxOfRecord4903() {
		assertEquals("973-429-9991", customers.get(4902).getFax());
	}

	@Test
	@DisplayName("Record 4903: Email is brain@pia.com")
	void EmailOfRecord4903() {
		assertEquals("brain@pia.com", customers.get(4902).getEmail());
	}

	@Test
	@DisplayName("Record 4903: Web is http://www.brainpia.com")
	void WebOfRecord4903() {
		assertEquals("http://www.brainpia.com", customers.get(4902).getWeb());
	}
}
