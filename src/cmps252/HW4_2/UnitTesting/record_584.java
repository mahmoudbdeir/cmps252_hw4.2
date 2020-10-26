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

@Tag("9")
class Record_584 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 584: FirstName is Alisa")
	void FirstNameOfRecord584() {
		assertEquals("Alisa", customers.get(583).getFirstName());
	}

	@Test
	@DisplayName("Record 584: LastName is Racina")
	void LastNameOfRecord584() {
		assertEquals("Racina", customers.get(583).getLastName());
	}

	@Test
	@DisplayName("Record 584: Company is Diamond, Philip R Esq")
	void CompanyOfRecord584() {
		assertEquals("Diamond, Philip R Esq", customers.get(583).getCompany());
	}

	@Test
	@DisplayName("Record 584: Address is Box #-4071")
	void AddressOfRecord584() {
		assertEquals("Box #-4071", customers.get(583).getAddress());
	}

	@Test
	@DisplayName("Record 584: City is Salinas")
	void CityOfRecord584() {
		assertEquals("Salinas", customers.get(583).getCity());
	}

	@Test
	@DisplayName("Record 584: County is Monterey")
	void CountyOfRecord584() {
		assertEquals("Monterey", customers.get(583).getCounty());
	}

	@Test
	@DisplayName("Record 584: State is CA")
	void StateOfRecord584() {
		assertEquals("CA", customers.get(583).getState());
	}

	@Test
	@DisplayName("Record 584: ZIP is 93912")
	void ZIPOfRecord584() {
		assertEquals("93912", customers.get(583).getZIP());
	}

	@Test
	@DisplayName("Record 584: Phone is 831-663-5584")
	void PhoneOfRecord584() {
		assertEquals("831-663-5584", customers.get(583).getPhone());
	}

	@Test
	@DisplayName("Record 584: Fax is 831-663-7636")
	void FaxOfRecord584() {
		assertEquals("831-663-7636", customers.get(583).getFax());
	}

	@Test
	@DisplayName("Record 584: Email is alisa@racina.com")
	void EmailOfRecord584() {
		assertEquals("alisa@racina.com", customers.get(583).getEmail());
	}

	@Test
	@DisplayName("Record 584: Web is http://www.alisaracina.com")
	void WebOfRecord584() {
		assertEquals("http://www.alisaracina.com", customers.get(583).getWeb());
	}
}
