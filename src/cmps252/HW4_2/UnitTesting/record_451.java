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

@Tag("48")
class Record_451 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 451: FirstName is Jerrold")
	void FirstNameOfRecord451() {
		assertEquals("Jerrold", customers.get(450).getFirstName());
	}

	@Test
	@DisplayName("Record 451: LastName is Wolke")
	void LastNameOfRecord451() {
		assertEquals("Wolke", customers.get(450).getLastName());
	}

	@Test
	@DisplayName("Record 451: Company is Parker Hannifin Corp Schrader")
	void CompanyOfRecord451() {
		assertEquals("Parker Hannifin Corp Schrader", customers.get(450).getCompany());
	}

	@Test
	@DisplayName("Record 451: Address is 1239 Broad St")
	void AddressOfRecord451() {
		assertEquals("1239 Broad St", customers.get(450).getAddress());
	}

	@Test
	@DisplayName("Record 451: City is Newark")
	void CityOfRecord451() {
		assertEquals("Newark", customers.get(450).getCity());
	}

	@Test
	@DisplayName("Record 451: County is Essex")
	void CountyOfRecord451() {
		assertEquals("Essex", customers.get(450).getCounty());
	}

	@Test
	@DisplayName("Record 451: State is NJ")
	void StateOfRecord451() {
		assertEquals("NJ", customers.get(450).getState());
	}

	@Test
	@DisplayName("Record 451: ZIP is 7114")
	void ZIPOfRecord451() {
		assertEquals("7114", customers.get(450).getZIP());
	}

	@Test
	@DisplayName("Record 451: Phone is 973-824-1243")
	void PhoneOfRecord451() {
		assertEquals("973-824-1243", customers.get(450).getPhone());
	}

	@Test
	@DisplayName("Record 451: Fax is 973-824-5854")
	void FaxOfRecord451() {
		assertEquals("973-824-5854", customers.get(450).getFax());
	}

	@Test
	@DisplayName("Record 451: Email is jerrold@wolke.com")
	void EmailOfRecord451() {
		assertEquals("jerrold@wolke.com", customers.get(450).getEmail());
	}

	@Test
	@DisplayName("Record 451: Web is http://www.jerroldwolke.com")
	void WebOfRecord451() {
		assertEquals("http://www.jerroldwolke.com", customers.get(450).getWeb());
	}
}
