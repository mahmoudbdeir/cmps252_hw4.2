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

@Tag("25")
class Record_4675 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4675: FirstName is Tammi")
	void FirstNameOfRecord4675() {
		assertEquals("Tammi", customers.get(4674).getFirstName());
	}

	@Test
	@DisplayName("Record 4675: LastName is Levylle")
	void LastNameOfRecord4675() {
		assertEquals("Levylle", customers.get(4674).getLastName());
	}

	@Test
	@DisplayName("Record 4675: Company is Hajoca")
	void CompanyOfRecord4675() {
		assertEquals("Hajoca", customers.get(4674).getCompany());
	}

	@Test
	@DisplayName("Record 4675: Address is 425 Cedar")
	void AddressOfRecord4675() {
		assertEquals("425 Cedar", customers.get(4674).getAddress());
	}

	@Test
	@DisplayName("Record 4675: City is Buena Vista")
	void CityOfRecord4675() {
		assertEquals("Buena Vista", customers.get(4674).getCity());
	}

	@Test
	@DisplayName("Record 4675: County is Chaffee")
	void CountyOfRecord4675() {
		assertEquals("Chaffee", customers.get(4674).getCounty());
	}

	@Test
	@DisplayName("Record 4675: State is CO")
	void StateOfRecord4675() {
		assertEquals("CO", customers.get(4674).getState());
	}

	@Test
	@DisplayName("Record 4675: ZIP is 81211")
	void ZIPOfRecord4675() {
		assertEquals("81211", customers.get(4674).getZIP());
	}

	@Test
	@DisplayName("Record 4675: Phone is 719-395-9515")
	void PhoneOfRecord4675() {
		assertEquals("719-395-9515", customers.get(4674).getPhone());
	}

	@Test
	@DisplayName("Record 4675: Fax is 719-395-5525")
	void FaxOfRecord4675() {
		assertEquals("719-395-5525", customers.get(4674).getFax());
	}

	@Test
	@DisplayName("Record 4675: Email is tammi@levylle.com")
	void EmailOfRecord4675() {
		assertEquals("tammi@levylle.com", customers.get(4674).getEmail());
	}

	@Test
	@DisplayName("Record 4675: Web is http://www.tammilevylle.com")
	void WebOfRecord4675() {
		assertEquals("http://www.tammilevylle.com", customers.get(4674).getWeb());
	}
}
