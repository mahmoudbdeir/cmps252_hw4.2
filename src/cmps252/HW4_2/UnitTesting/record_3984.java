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
class Record_3984 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3984: FirstName is Sheree")
	void FirstNameOfRecord3984() {
		assertEquals("Sheree", customers.get(3983).getFirstName());
	}

	@Test
	@DisplayName("Record 3984: LastName is Faubel")
	void LastNameOfRecord3984() {
		assertEquals("Faubel", customers.get(3983).getLastName());
	}

	@Test
	@DisplayName("Record 3984: Company is Michel, Dominique D Esq")
	void CompanyOfRecord3984() {
		assertEquals("Michel, Dominique D Esq", customers.get(3983).getCompany());
	}

	@Test
	@DisplayName("Record 3984: Address is 6300 S Syracuse Way  #-601")
	void AddressOfRecord3984() {
		assertEquals("6300 S Syracuse Way  #-601", customers.get(3983).getAddress());
	}

	@Test
	@DisplayName("Record 3984: City is Englewood")
	void CityOfRecord3984() {
		assertEquals("Englewood", customers.get(3983).getCity());
	}

	@Test
	@DisplayName("Record 3984: County is Arapahoe")
	void CountyOfRecord3984() {
		assertEquals("Arapahoe", customers.get(3983).getCounty());
	}

	@Test
	@DisplayName("Record 3984: State is CO")
	void StateOfRecord3984() {
		assertEquals("CO", customers.get(3983).getState());
	}

	@Test
	@DisplayName("Record 3984: ZIP is 80111")
	void ZIPOfRecord3984() {
		assertEquals("80111", customers.get(3983).getZIP());
	}

	@Test
	@DisplayName("Record 3984: Phone is 303-741-9096")
	void PhoneOfRecord3984() {
		assertEquals("303-741-9096", customers.get(3983).getPhone());
	}

	@Test
	@DisplayName("Record 3984: Fax is 303-741-6488")
	void FaxOfRecord3984() {
		assertEquals("303-741-6488", customers.get(3983).getFax());
	}

	@Test
	@DisplayName("Record 3984: Email is sheree@faubel.com")
	void EmailOfRecord3984() {
		assertEquals("sheree@faubel.com", customers.get(3983).getEmail());
	}

	@Test
	@DisplayName("Record 3984: Web is http://www.shereefaubel.com")
	void WebOfRecord3984() {
		assertEquals("http://www.shereefaubel.com", customers.get(3983).getWeb());
	}
}
