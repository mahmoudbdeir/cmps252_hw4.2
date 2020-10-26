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

@Tag("44")
class Record_4802 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4802: FirstName is Fannie")
	void FirstNameOfRecord4802() {
		assertEquals("Fannie", customers.get(4801).getFirstName());
	}

	@Test
	@DisplayName("Record 4802: LastName is Fayne")
	void LastNameOfRecord4802() {
		assertEquals("Fayne", customers.get(4801).getLastName());
	}

	@Test
	@DisplayName("Record 4802: Company is Whitmore, Stephen F Esq")
	void CompanyOfRecord4802() {
		assertEquals("Whitmore, Stephen F Esq", customers.get(4801).getCompany());
	}

	@Test
	@DisplayName("Record 4802: Address is 100 Dorigo Ln")
	void AddressOfRecord4802() {
		assertEquals("100 Dorigo Ln", customers.get(4801).getAddress());
	}

	@Test
	@DisplayName("Record 4802: City is Secaucus")
	void CityOfRecord4802() {
		assertEquals("Secaucus", customers.get(4801).getCity());
	}

	@Test
	@DisplayName("Record 4802: County is Hudson")
	void CountyOfRecord4802() {
		assertEquals("Hudson", customers.get(4801).getCounty());
	}

	@Test
	@DisplayName("Record 4802: State is NJ")
	void StateOfRecord4802() {
		assertEquals("NJ", customers.get(4801).getState());
	}

	@Test
	@DisplayName("Record 4802: ZIP is 7094")
	void ZIPOfRecord4802() {
		assertEquals("7094", customers.get(4801).getZIP());
	}

	@Test
	@DisplayName("Record 4802: Phone is 201-866-3565")
	void PhoneOfRecord4802() {
		assertEquals("201-866-3565", customers.get(4801).getPhone());
	}

	@Test
	@DisplayName("Record 4802: Fax is 201-866-4873")
	void FaxOfRecord4802() {
		assertEquals("201-866-4873", customers.get(4801).getFax());
	}

	@Test
	@DisplayName("Record 4802: Email is fannie@fayne.com")
	void EmailOfRecord4802() {
		assertEquals("fannie@fayne.com", customers.get(4801).getEmail());
	}

	@Test
	@DisplayName("Record 4802: Web is http://www.fanniefayne.com")
	void WebOfRecord4802() {
		assertEquals("http://www.fanniefayne.com", customers.get(4801).getWeb());
	}
}
