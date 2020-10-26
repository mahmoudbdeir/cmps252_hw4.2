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

@Tag("11")
class Record_3786 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3786: FirstName is Rosario")
	void FirstNameOfRecord3786() {
		assertEquals("Rosario", customers.get(3785).getFirstName());
	}

	@Test
	@DisplayName("Record 3786: LastName is Fasbender")
	void LastNameOfRecord3786() {
		assertEquals("Fasbender", customers.get(3785).getLastName());
	}

	@Test
	@DisplayName("Record 3786: Company is Armstrong, Gibbons Esq")
	void CompanyOfRecord3786() {
		assertEquals("Armstrong, Gibbons Esq", customers.get(3785).getCompany());
	}

	@Test
	@DisplayName("Record 3786: Address is 825 N 7th St")
	void AddressOfRecord3786() {
		assertEquals("825 N 7th St", customers.get(3785).getAddress());
	}

	@Test
	@DisplayName("Record 3786: City is Phoenix")
	void CityOfRecord3786() {
		assertEquals("Phoenix", customers.get(3785).getCity());
	}

	@Test
	@DisplayName("Record 3786: County is Maricopa")
	void CountyOfRecord3786() {
		assertEquals("Maricopa", customers.get(3785).getCounty());
	}

	@Test
	@DisplayName("Record 3786: State is AZ")
	void StateOfRecord3786() {
		assertEquals("AZ", customers.get(3785).getState());
	}

	@Test
	@DisplayName("Record 3786: ZIP is 85006")
	void ZIPOfRecord3786() {
		assertEquals("85006", customers.get(3785).getZIP());
	}

	@Test
	@DisplayName("Record 3786: Phone is 602-258-2366")
	void PhoneOfRecord3786() {
		assertEquals("602-258-2366", customers.get(3785).getPhone());
	}

	@Test
	@DisplayName("Record 3786: Fax is 602-258-3218")
	void FaxOfRecord3786() {
		assertEquals("602-258-3218", customers.get(3785).getFax());
	}

	@Test
	@DisplayName("Record 3786: Email is rosario@fasbender.com")
	void EmailOfRecord3786() {
		assertEquals("rosario@fasbender.com", customers.get(3785).getEmail());
	}

	@Test
	@DisplayName("Record 3786: Web is http://www.rosariofasbender.com")
	void WebOfRecord3786() {
		assertEquals("http://www.rosariofasbender.com", customers.get(3785).getWeb());
	}
}
