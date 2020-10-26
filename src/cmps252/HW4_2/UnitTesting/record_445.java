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
class Record_445 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 445: FirstName is Bobby")
	void FirstNameOfRecord445() {
		assertEquals("Bobby", customers.get(444).getFirstName());
	}

	@Test
	@DisplayName("Record 445: LastName is Bregon")
	void LastNameOfRecord445() {
		assertEquals("Bregon", customers.get(444).getLastName());
	}

	@Test
	@DisplayName("Record 445: Company is Sweeney, David J Esq")
	void CompanyOfRecord445() {
		assertEquals("Sweeney, David J Esq", customers.get(444).getCompany());
	}

	@Test
	@DisplayName("Record 445: Address is 87 Bowne St")
	void AddressOfRecord445() {
		assertEquals("87 Bowne St", customers.get(444).getAddress());
	}

	@Test
	@DisplayName("Record 445: City is Brooklyn")
	void CityOfRecord445() {
		assertEquals("Brooklyn", customers.get(444).getCity());
	}

	@Test
	@DisplayName("Record 445: County is Kings")
	void CountyOfRecord445() {
		assertEquals("Kings", customers.get(444).getCounty());
	}

	@Test
	@DisplayName("Record 445: State is NY")
	void StateOfRecord445() {
		assertEquals("NY", customers.get(444).getState());
	}

	@Test
	@DisplayName("Record 445: ZIP is 11231")
	void ZIPOfRecord445() {
		assertEquals("11231", customers.get(444).getZIP());
	}

	@Test
	@DisplayName("Record 445: Phone is 718-797-4851")
	void PhoneOfRecord445() {
		assertEquals("718-797-4851", customers.get(444).getPhone());
	}

	@Test
	@DisplayName("Record 445: Fax is 718-797-3817")
	void FaxOfRecord445() {
		assertEquals("718-797-3817", customers.get(444).getFax());
	}

	@Test
	@DisplayName("Record 445: Email is bobby@bregon.com")
	void EmailOfRecord445() {
		assertEquals("bobby@bregon.com", customers.get(444).getEmail());
	}

	@Test
	@DisplayName("Record 445: Web is http://www.bobbybregon.com")
	void WebOfRecord445() {
		assertEquals("http://www.bobbybregon.com", customers.get(444).getWeb());
	}
}
