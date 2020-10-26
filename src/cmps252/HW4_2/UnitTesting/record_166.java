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

@Tag("17")
class Record_166 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 166: FirstName is Noelle")
	void FirstNameOfRecord166() {
		assertEquals("Noelle", customers.get(165).getFirstName());
	}

	@Test
	@DisplayName("Record 166: LastName is Savas")
	void LastNameOfRecord166() {
		assertEquals("Savas", customers.get(165).getLastName());
	}

	@Test
	@DisplayName("Record 166: Company is Kaplan, Drew P Esq")
	void CompanyOfRecord166() {
		assertEquals("Kaplan, Drew P Esq", customers.get(165).getCompany());
	}

	@Test
	@DisplayName("Record 166: Address is 684 S Highway 17  #-92")
	void AddressOfRecord166() {
		assertEquals("684 S Highway 17  #-92", customers.get(165).getAddress());
	}

	@Test
	@DisplayName("Record 166: City is Longwood")
	void CityOfRecord166() {
		assertEquals("Longwood", customers.get(165).getCity());
	}

	@Test
	@DisplayName("Record 166: County is Seminole")
	void CountyOfRecord166() {
		assertEquals("Seminole", customers.get(165).getCounty());
	}

	@Test
	@DisplayName("Record 166: State is FL")
	void StateOfRecord166() {
		assertEquals("FL", customers.get(165).getState());
	}

	@Test
	@DisplayName("Record 166: ZIP is 32750")
	void ZIPOfRecord166() {
		assertEquals("32750", customers.get(165).getZIP());
	}

	@Test
	@DisplayName("Record 166: Phone is 407-260-0688")
	void PhoneOfRecord166() {
		assertEquals("407-260-0688", customers.get(165).getPhone());
	}

	@Test
	@DisplayName("Record 166: Fax is 407-260-5049")
	void FaxOfRecord166() {
		assertEquals("407-260-5049", customers.get(165).getFax());
	}

	@Test
	@DisplayName("Record 166: Email is noelle@savas.com")
	void EmailOfRecord166() {
		assertEquals("noelle@savas.com", customers.get(165).getEmail());
	}

	@Test
	@DisplayName("Record 166: Web is http://www.noellesavas.com")
	void WebOfRecord166() {
		assertEquals("http://www.noellesavas.com", customers.get(165).getWeb());
	}
}
