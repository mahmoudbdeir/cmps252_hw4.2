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

@Tag("17")
class Record_4332 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4332: FirstName is Ruth")
	void FirstNameOfRecord4332() {
		assertEquals("Ruth", customers.get(4331).getFirstName());
	}

	@Test
	@DisplayName("Record 4332: LastName is Donaghy")
	void LastNameOfRecord4332() {
		assertEquals("Donaghy", customers.get(4331).getLastName());
	}

	@Test
	@DisplayName("Record 4332: Company is Kaplan, J Jason Esq")
	void CompanyOfRecord4332() {
		assertEquals("Kaplan, J Jason Esq", customers.get(4331).getCompany());
	}

	@Test
	@DisplayName("Record 4332: Address is 780 Johnson Ferry Road  #-200")
	void AddressOfRecord4332() {
		assertEquals("780 Johnson Ferry Road  #-200", customers.get(4331).getAddress());
	}

	@Test
	@DisplayName("Record 4332: City is Atlanta")
	void CityOfRecord4332() {
		assertEquals("Atlanta", customers.get(4331).getCity());
	}

	@Test
	@DisplayName("Record 4332: County is Fulton")
	void CountyOfRecord4332() {
		assertEquals("Fulton", customers.get(4331).getCounty());
	}

	@Test
	@DisplayName("Record 4332: State is GA")
	void StateOfRecord4332() {
		assertEquals("GA", customers.get(4331).getState());
	}

	@Test
	@DisplayName("Record 4332: ZIP is 30342")
	void ZIPOfRecord4332() {
		assertEquals("30342", customers.get(4331).getZIP());
	}

	@Test
	@DisplayName("Record 4332: Phone is 404-851-8878")
	void PhoneOfRecord4332() {
		assertEquals("404-851-8878", customers.get(4331).getPhone());
	}

	@Test
	@DisplayName("Record 4332: Fax is 404-851-1915")
	void FaxOfRecord4332() {
		assertEquals("404-851-1915", customers.get(4331).getFax());
	}

	@Test
	@DisplayName("Record 4332: Email is ruth@donaghy.com")
	void EmailOfRecord4332() {
		assertEquals("ruth@donaghy.com", customers.get(4331).getEmail());
	}

	@Test
	@DisplayName("Record 4332: Web is http://www.ruthdonaghy.com")
	void WebOfRecord4332() {
		assertEquals("http://www.ruthdonaghy.com", customers.get(4331).getWeb());
	}
}
