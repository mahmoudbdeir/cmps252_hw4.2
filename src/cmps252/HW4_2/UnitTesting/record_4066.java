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

@Tag("20")
class Record_4066 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4066: FirstName is Percy")
	void FirstNameOfRecord4066() {
		assertEquals("Percy", customers.get(4065).getFirstName());
	}

	@Test
	@DisplayName("Record 4066: LastName is Hajdas")
	void LastNameOfRecord4066() {
		assertEquals("Hajdas", customers.get(4065).getLastName());
	}

	@Test
	@DisplayName("Record 4066: Company is Bright, John H Esq")
	void CompanyOfRecord4066() {
		assertEquals("Bright, John H Esq", customers.get(4065).getCompany());
	}

	@Test
	@DisplayName("Record 4066: Address is 3830 Terrace St")
	void AddressOfRecord4066() {
		assertEquals("3830 Terrace St", customers.get(4065).getAddress());
	}

	@Test
	@DisplayName("Record 4066: City is Philadelphia")
	void CityOfRecord4066() {
		assertEquals("Philadelphia", customers.get(4065).getCity());
	}

	@Test
	@DisplayName("Record 4066: County is Philadelphia")
	void CountyOfRecord4066() {
		assertEquals("Philadelphia", customers.get(4065).getCounty());
	}

	@Test
	@DisplayName("Record 4066: State is PA")
	void StateOfRecord4066() {
		assertEquals("PA", customers.get(4065).getState());
	}

	@Test
	@DisplayName("Record 4066: ZIP is 19128")
	void ZIPOfRecord4066() {
		assertEquals("19128", customers.get(4065).getZIP());
	}

	@Test
	@DisplayName("Record 4066: Phone is 215-487-9141")
	void PhoneOfRecord4066() {
		assertEquals("215-487-9141", customers.get(4065).getPhone());
	}

	@Test
	@DisplayName("Record 4066: Fax is 215-487-8456")
	void FaxOfRecord4066() {
		assertEquals("215-487-8456", customers.get(4065).getFax());
	}

	@Test
	@DisplayName("Record 4066: Email is percy@hajdas.com")
	void EmailOfRecord4066() {
		assertEquals("percy@hajdas.com", customers.get(4065).getEmail());
	}

	@Test
	@DisplayName("Record 4066: Web is http://www.percyhajdas.com")
	void WebOfRecord4066() {
		assertEquals("http://www.percyhajdas.com", customers.get(4065).getWeb());
	}
}
