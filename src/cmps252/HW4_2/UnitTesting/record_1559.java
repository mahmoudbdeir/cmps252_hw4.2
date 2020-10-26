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

@Tag("15")
class Record_1559 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1559: FirstName is Erika")
	void FirstNameOfRecord1559() {
		assertEquals("Erika", customers.get(1558).getFirstName());
	}

	@Test
	@DisplayName("Record 1559: LastName is Ravert")
	void LastNameOfRecord1559() {
		assertEquals("Ravert", customers.get(1558).getLastName());
	}

	@Test
	@DisplayName("Record 1559: Company is Pierre Frozen Foods")
	void CompanyOfRecord1559() {
		assertEquals("Pierre Frozen Foods", customers.get(1558).getCompany());
	}

	@Test
	@DisplayName("Record 1559: Address is 6100 Bandera Rd  #-401")
	void AddressOfRecord1559() {
		assertEquals("6100 Bandera Rd  #-401", customers.get(1558).getAddress());
	}

	@Test
	@DisplayName("Record 1559: City is San Antonio")
	void CityOfRecord1559() {
		assertEquals("San Antonio", customers.get(1558).getCity());
	}

	@Test
	@DisplayName("Record 1559: County is Bexar")
	void CountyOfRecord1559() {
		assertEquals("Bexar", customers.get(1558).getCounty());
	}

	@Test
	@DisplayName("Record 1559: State is TX")
	void StateOfRecord1559() {
		assertEquals("TX", customers.get(1558).getState());
	}

	@Test
	@DisplayName("Record 1559: ZIP is 78238")
	void ZIPOfRecord1559() {
		assertEquals("78238", customers.get(1558).getZIP());
	}

	@Test
	@DisplayName("Record 1559: Phone is 210-681-1070")
	void PhoneOfRecord1559() {
		assertEquals("210-681-1070", customers.get(1558).getPhone());
	}

	@Test
	@DisplayName("Record 1559: Fax is 210-681-2983")
	void FaxOfRecord1559() {
		assertEquals("210-681-2983", customers.get(1558).getFax());
	}

	@Test
	@DisplayName("Record 1559: Email is erika@ravert.com")
	void EmailOfRecord1559() {
		assertEquals("erika@ravert.com", customers.get(1558).getEmail());
	}

	@Test
	@DisplayName("Record 1559: Web is http://www.erikaravert.com")
	void WebOfRecord1559() {
		assertEquals("http://www.erikaravert.com", customers.get(1558).getWeb());
	}
}
