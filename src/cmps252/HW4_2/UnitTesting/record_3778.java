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

@Tag("4")
class Record_3778 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3778: FirstName is Felicia")
	void FirstNameOfRecord3778() {
		assertEquals("Felicia", customers.get(3777).getFirstName());
	}

	@Test
	@DisplayName("Record 3778: LastName is Ryfel")
	void LastNameOfRecord3778() {
		assertEquals("Ryfel", customers.get(3777).getLastName());
	}

	@Test
	@DisplayName("Record 3778: Company is Daveco Chicago Inc")
	void CompanyOfRecord3778() {
		assertEquals("Daveco Chicago Inc", customers.get(3777).getCompany());
	}

	@Test
	@DisplayName("Record 3778: Address is 1607 W River Dr")
	void AddressOfRecord3778() {
		assertEquals("1607 W River Dr", customers.get(3777).getAddress());
	}

	@Test
	@DisplayName("Record 3778: City is Davenport")
	void CityOfRecord3778() {
		assertEquals("Davenport", customers.get(3777).getCity());
	}

	@Test
	@DisplayName("Record 3778: County is Scott")
	void CountyOfRecord3778() {
		assertEquals("Scott", customers.get(3777).getCounty());
	}

	@Test
	@DisplayName("Record 3778: State is IA")
	void StateOfRecord3778() {
		assertEquals("IA", customers.get(3777).getState());
	}

	@Test
	@DisplayName("Record 3778: ZIP is 52802")
	void ZIPOfRecord3778() {
		assertEquals("52802", customers.get(3777).getZIP());
	}

	@Test
	@DisplayName("Record 3778: Phone is 563-323-0496")
	void PhoneOfRecord3778() {
		assertEquals("563-323-0496", customers.get(3777).getPhone());
	}

	@Test
	@DisplayName("Record 3778: Fax is 563-323-2651")
	void FaxOfRecord3778() {
		assertEquals("563-323-2651", customers.get(3777).getFax());
	}

	@Test
	@DisplayName("Record 3778: Email is felicia@ryfel.com")
	void EmailOfRecord3778() {
		assertEquals("felicia@ryfel.com", customers.get(3777).getEmail());
	}

	@Test
	@DisplayName("Record 3778: Web is http://www.feliciaryfel.com")
	void WebOfRecord3778() {
		assertEquals("http://www.feliciaryfel.com", customers.get(3777).getWeb());
	}
}
