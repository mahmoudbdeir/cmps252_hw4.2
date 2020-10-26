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

@Tag("29")
class Record_484 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 484: FirstName is Margo")
	void FirstNameOfRecord484() {
		assertEquals("Margo", customers.get(483).getFirstName());
	}

	@Test
	@DisplayName("Record 484: LastName is Bassil")
	void LastNameOfRecord484() {
		assertEquals("Bassil", customers.get(483).getLastName());
	}

	@Test
	@DisplayName("Record 484: Company is Tony Callaway Insurance Agcy")
	void CompanyOfRecord484() {
		assertEquals("Tony Callaway Insurance Agcy", customers.get(483).getCompany());
	}

	@Test
	@DisplayName("Record 484: Address is 503 Alexander Dr")
	void AddressOfRecord484() {
		assertEquals("503 Alexander Dr", customers.get(483).getAddress());
	}

	@Test
	@DisplayName("Record 484: City is Ephrata")
	void CityOfRecord484() {
		assertEquals("Ephrata", customers.get(483).getCity());
	}

	@Test
	@DisplayName("Record 484: County is Lancaster")
	void CountyOfRecord484() {
		assertEquals("Lancaster", customers.get(483).getCounty());
	}

	@Test
	@DisplayName("Record 484: State is PA")
	void StateOfRecord484() {
		assertEquals("PA", customers.get(483).getState());
	}

	@Test
	@DisplayName("Record 484: ZIP is 17522")
	void ZIPOfRecord484() {
		assertEquals("17522", customers.get(483).getZIP());
	}

	@Test
	@DisplayName("Record 484: Phone is 717-738-4542")
	void PhoneOfRecord484() {
		assertEquals("717-738-4542", customers.get(483).getPhone());
	}

	@Test
	@DisplayName("Record 484: Fax is 717-738-3978")
	void FaxOfRecord484() {
		assertEquals("717-738-3978", customers.get(483).getFax());
	}

	@Test
	@DisplayName("Record 484: Email is margo@bassil.com")
	void EmailOfRecord484() {
		assertEquals("margo@bassil.com", customers.get(483).getEmail());
	}

	@Test
	@DisplayName("Record 484: Web is http://www.margobassil.com")
	void WebOfRecord484() {
		assertEquals("http://www.margobassil.com", customers.get(483).getWeb());
	}
}
