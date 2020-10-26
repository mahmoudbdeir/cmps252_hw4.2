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

@Tag("36")
class Record_1089 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1089: FirstName is Dominique")
	void FirstNameOfRecord1089() {
		assertEquals("Dominique", customers.get(1088).getFirstName());
	}

	@Test
	@DisplayName("Record 1089: LastName is Monjaras")
	void LastNameOfRecord1089() {
		assertEquals("Monjaras", customers.get(1088).getLastName());
	}

	@Test
	@DisplayName("Record 1089: Company is Kerxton, Alan S Esq")
	void CompanyOfRecord1089() {
		assertEquals("Kerxton, Alan S Esq", customers.get(1088).getCompany());
	}

	@Test
	@DisplayName("Record 1089: Address is 155 N Ridge Ave")
	void AddressOfRecord1089() {
		assertEquals("155 N Ridge Ave", customers.get(1088).getAddress());
	}

	@Test
	@DisplayName("Record 1089: City is Ambler")
	void CityOfRecord1089() {
		assertEquals("Ambler", customers.get(1088).getCity());
	}

	@Test
	@DisplayName("Record 1089: County is Montgomery")
	void CountyOfRecord1089() {
		assertEquals("Montgomery", customers.get(1088).getCounty());
	}

	@Test
	@DisplayName("Record 1089: State is PA")
	void StateOfRecord1089() {
		assertEquals("PA", customers.get(1088).getState());
	}

	@Test
	@DisplayName("Record 1089: ZIP is 19002")
	void ZIPOfRecord1089() {
		assertEquals("19002", customers.get(1088).getZIP());
	}

	@Test
	@DisplayName("Record 1089: Phone is 215-646-6619")
	void PhoneOfRecord1089() {
		assertEquals("215-646-6619", customers.get(1088).getPhone());
	}

	@Test
	@DisplayName("Record 1089: Fax is 215-646-6429")
	void FaxOfRecord1089() {
		assertEquals("215-646-6429", customers.get(1088).getFax());
	}

	@Test
	@DisplayName("Record 1089: Email is dominique@monjaras.com")
	void EmailOfRecord1089() {
		assertEquals("dominique@monjaras.com", customers.get(1088).getEmail());
	}

	@Test
	@DisplayName("Record 1089: Web is http://www.dominiquemonjaras.com")
	void WebOfRecord1089() {
		assertEquals("http://www.dominiquemonjaras.com", customers.get(1088).getWeb());
	}
}
