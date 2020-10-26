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

@Tag("34")
class Record_3946 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3946: FirstName is Mohammed")
	void FirstNameOfRecord3946() {
		assertEquals("Mohammed", customers.get(3945).getFirstName());
	}

	@Test
	@DisplayName("Record 3946: LastName is Kowalik")
	void LastNameOfRecord3946() {
		assertEquals("Kowalik", customers.get(3945).getLastName());
	}

	@Test
	@DisplayName("Record 3946: Company is Fagan, Julie R Md")
	void CompanyOfRecord3946() {
		assertEquals("Fagan, Julie R Md", customers.get(3945).getCompany());
	}

	@Test
	@DisplayName("Record 3946: Address is 514 S Main St")
	void AddressOfRecord3946() {
		assertEquals("514 S Main St", customers.get(3945).getAddress());
	}

	@Test
	@DisplayName("Record 3946: City is Aberdeen")
	void CityOfRecord3946() {
		assertEquals("Aberdeen", customers.get(3945).getCity());
	}

	@Test
	@DisplayName("Record 3946: County is Brown")
	void CountyOfRecord3946() {
		assertEquals("Brown", customers.get(3945).getCounty());
	}

	@Test
	@DisplayName("Record 3946: State is SD")
	void StateOfRecord3946() {
		assertEquals("SD", customers.get(3945).getState());
	}

	@Test
	@DisplayName("Record 3946: ZIP is 57401")
	void ZIPOfRecord3946() {
		assertEquals("57401", customers.get(3945).getZIP());
	}

	@Test
	@DisplayName("Record 3946: Phone is 605-229-3194")
	void PhoneOfRecord3946() {
		assertEquals("605-229-3194", customers.get(3945).getPhone());
	}

	@Test
	@DisplayName("Record 3946: Fax is 605-229-4541")
	void FaxOfRecord3946() {
		assertEquals("605-229-4541", customers.get(3945).getFax());
	}

	@Test
	@DisplayName("Record 3946: Email is mohammed@kowalik.com")
	void EmailOfRecord3946() {
		assertEquals("mohammed@kowalik.com", customers.get(3945).getEmail());
	}

	@Test
	@DisplayName("Record 3946: Web is http://www.mohammedkowalik.com")
	void WebOfRecord3946() {
		assertEquals("http://www.mohammedkowalik.com", customers.get(3945).getWeb());
	}
}
