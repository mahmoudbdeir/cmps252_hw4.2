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

@Tag("18")
class Record_1933 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1933: FirstName is Carrol")
	void FirstNameOfRecord1933() {
		assertEquals("Carrol", customers.get(1932).getFirstName());
	}

	@Test
	@DisplayName("Record 1933: LastName is Chaudet")
	void LastNameOfRecord1933() {
		assertEquals("Chaudet", customers.get(1932).getLastName());
	}

	@Test
	@DisplayName("Record 1933: Company is Solmson, William S Esq")
	void CompanyOfRecord1933() {
		assertEquals("Solmson, William S Esq", customers.get(1932).getCompany());
	}

	@Test
	@DisplayName("Record 1933: Address is 225 Boul")
	void AddressOfRecord1933() {
		assertEquals("225 Boul", customers.get(1932).getAddress());
	}

	@Test
	@DisplayName("Record 1933: City is Pequannock")
	void CityOfRecord1933() {
		assertEquals("Pequannock", customers.get(1932).getCity());
	}

	@Test
	@DisplayName("Record 1933: County is Morris")
	void CountyOfRecord1933() {
		assertEquals("Morris", customers.get(1932).getCounty());
	}

	@Test
	@DisplayName("Record 1933: State is NJ")
	void StateOfRecord1933() {
		assertEquals("NJ", customers.get(1932).getState());
	}

	@Test
	@DisplayName("Record 1933: ZIP is 7440")
	void ZIPOfRecord1933() {
		assertEquals("7440", customers.get(1932).getZIP());
	}

	@Test
	@DisplayName("Record 1933: Phone is 973-831-3480")
	void PhoneOfRecord1933() {
		assertEquals("973-831-3480", customers.get(1932).getPhone());
	}

	@Test
	@DisplayName("Record 1933: Fax is 973-831-7091")
	void FaxOfRecord1933() {
		assertEquals("973-831-7091", customers.get(1932).getFax());
	}

	@Test
	@DisplayName("Record 1933: Email is carrol@chaudet.com")
	void EmailOfRecord1933() {
		assertEquals("carrol@chaudet.com", customers.get(1932).getEmail());
	}

	@Test
	@DisplayName("Record 1933: Web is http://www.carrolchaudet.com")
	void WebOfRecord1933() {
		assertEquals("http://www.carrolchaudet.com", customers.get(1932).getWeb());
	}
}
