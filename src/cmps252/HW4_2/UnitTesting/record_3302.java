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

@Tag("39")
class Record_3302 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3302: FirstName is Arturo")
	void FirstNameOfRecord3302() {
		assertEquals("Arturo", customers.get(3301).getFirstName());
	}

	@Test
	@DisplayName("Record 3302: LastName is Nesin")
	void LastNameOfRecord3302() {
		assertEquals("Nesin", customers.get(3301).getLastName());
	}

	@Test
	@DisplayName("Record 3302: Company is Ati Communications")
	void CompanyOfRecord3302() {
		assertEquals("Ati Communications", customers.get(3301).getCompany());
	}

	@Test
	@DisplayName("Record 3302: Address is 3401 N 6th St")
	void AddressOfRecord3302() {
		assertEquals("3401 N 6th St", customers.get(3301).getAddress());
	}

	@Test
	@DisplayName("Record 3302: City is Harrisburg")
	void CityOfRecord3302() {
		assertEquals("Harrisburg", customers.get(3301).getCity());
	}

	@Test
	@DisplayName("Record 3302: County is Dauphin")
	void CountyOfRecord3302() {
		assertEquals("Dauphin", customers.get(3301).getCounty());
	}

	@Test
	@DisplayName("Record 3302: State is PA")
	void StateOfRecord3302() {
		assertEquals("PA", customers.get(3301).getState());
	}

	@Test
	@DisplayName("Record 3302: ZIP is 17110")
	void ZIPOfRecord3302() {
		assertEquals("17110", customers.get(3301).getZIP());
	}

	@Test
	@DisplayName("Record 3302: Phone is 717-233-9025")
	void PhoneOfRecord3302() {
		assertEquals("717-233-9025", customers.get(3301).getPhone());
	}

	@Test
	@DisplayName("Record 3302: Fax is 717-233-1666")
	void FaxOfRecord3302() {
		assertEquals("717-233-1666", customers.get(3301).getFax());
	}

	@Test
	@DisplayName("Record 3302: Email is arturo@nesin.com")
	void EmailOfRecord3302() {
		assertEquals("arturo@nesin.com", customers.get(3301).getEmail());
	}

	@Test
	@DisplayName("Record 3302: Web is http://www.arturonesin.com")
	void WebOfRecord3302() {
		assertEquals("http://www.arturonesin.com", customers.get(3301).getWeb());
	}
}
