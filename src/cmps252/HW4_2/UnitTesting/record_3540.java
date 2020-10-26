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

@Tag("21")
class Record_3540 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3540: FirstName is Nadine")
	void FirstNameOfRecord3540() {
		assertEquals("Nadine", customers.get(3539).getFirstName());
	}

	@Test
	@DisplayName("Record 3540: LastName is Deeter")
	void LastNameOfRecord3540() {
		assertEquals("Deeter", customers.get(3539).getLastName());
	}

	@Test
	@DisplayName("Record 3540: Company is Crescent Designed Metal Inc")
	void CompanyOfRecord3540() {
		assertEquals("Crescent Designed Metal Inc", customers.get(3539).getCompany());
	}

	@Test
	@DisplayName("Record 3540: Address is 685 Broadway")
	void AddressOfRecord3540() {
		assertEquals("685 Broadway", customers.get(3539).getAddress());
	}

	@Test
	@DisplayName("Record 3540: City is Bayonne")
	void CityOfRecord3540() {
		assertEquals("Bayonne", customers.get(3539).getCity());
	}

	@Test
	@DisplayName("Record 3540: County is Hudson")
	void CountyOfRecord3540() {
		assertEquals("Hudson", customers.get(3539).getCounty());
	}

	@Test
	@DisplayName("Record 3540: State is NJ")
	void StateOfRecord3540() {
		assertEquals("NJ", customers.get(3539).getState());
	}

	@Test
	@DisplayName("Record 3540: ZIP is 7002")
	void ZIPOfRecord3540() {
		assertEquals("7002", customers.get(3539).getZIP());
	}

	@Test
	@DisplayName("Record 3540: Phone is 201-823-5764")
	void PhoneOfRecord3540() {
		assertEquals("201-823-5764", customers.get(3539).getPhone());
	}

	@Test
	@DisplayName("Record 3540: Fax is 201-823-0397")
	void FaxOfRecord3540() {
		assertEquals("201-823-0397", customers.get(3539).getFax());
	}

	@Test
	@DisplayName("Record 3540: Email is nadine@deeter.com")
	void EmailOfRecord3540() {
		assertEquals("nadine@deeter.com", customers.get(3539).getEmail());
	}

	@Test
	@DisplayName("Record 3540: Web is http://www.nadinedeeter.com")
	void WebOfRecord3540() {
		assertEquals("http://www.nadinedeeter.com", customers.get(3539).getWeb());
	}
}
