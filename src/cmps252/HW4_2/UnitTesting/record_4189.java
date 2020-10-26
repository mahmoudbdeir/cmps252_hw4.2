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

@Tag("6")
class Record_4189 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4189: FirstName is Liliana")
	void FirstNameOfRecord4189() {
		assertEquals("Liliana", customers.get(4188).getFirstName());
	}

	@Test
	@DisplayName("Record 4189: LastName is Aiton")
	void LastNameOfRecord4189() {
		assertEquals("Aiton", customers.get(4188).getLastName());
	}

	@Test
	@DisplayName("Record 4189: Company is Noble, Catherine H Esq")
	void CompanyOfRecord4189() {
		assertEquals("Noble, Catherine H Esq", customers.get(4188).getCompany());
	}

	@Test
	@DisplayName("Record 4189: Address is 3635 N 68th St  #-htl")
	void AddressOfRecord4189() {
		assertEquals("3635 N 68th St  #-htl", customers.get(4188).getAddress());
	}

	@Test
	@DisplayName("Record 4189: City is Scottsdale")
	void CityOfRecord4189() {
		assertEquals("Scottsdale", customers.get(4188).getCity());
	}

	@Test
	@DisplayName("Record 4189: County is Maricopa")
	void CountyOfRecord4189() {
		assertEquals("Maricopa", customers.get(4188).getCounty());
	}

	@Test
	@DisplayName("Record 4189: State is AZ")
	void StateOfRecord4189() {
		assertEquals("AZ", customers.get(4188).getState());
	}

	@Test
	@DisplayName("Record 4189: ZIP is 85251")
	void ZIPOfRecord4189() {
		assertEquals("85251", customers.get(4188).getZIP());
	}

	@Test
	@DisplayName("Record 4189: Phone is 480-945-1894")
	void PhoneOfRecord4189() {
		assertEquals("480-945-1894", customers.get(4188).getPhone());
	}

	@Test
	@DisplayName("Record 4189: Fax is 480-945-5321")
	void FaxOfRecord4189() {
		assertEquals("480-945-5321", customers.get(4188).getFax());
	}

	@Test
	@DisplayName("Record 4189: Email is liliana@aiton.com")
	void EmailOfRecord4189() {
		assertEquals("liliana@aiton.com", customers.get(4188).getEmail());
	}

	@Test
	@DisplayName("Record 4189: Web is http://www.lilianaaiton.com")
	void WebOfRecord4189() {
		assertEquals("http://www.lilianaaiton.com", customers.get(4188).getWeb());
	}
}
