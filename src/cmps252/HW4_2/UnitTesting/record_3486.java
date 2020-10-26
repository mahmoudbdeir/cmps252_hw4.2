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

@Tag("40")
class Record_3486 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3486: FirstName is Kellie")
	void FirstNameOfRecord3486() {
		assertEquals("Kellie", customers.get(3485).getFirstName());
	}

	@Test
	@DisplayName("Record 3486: LastName is Sanots")
	void LastNameOfRecord3486() {
		assertEquals("Sanots", customers.get(3485).getLastName());
	}

	@Test
	@DisplayName("Record 3486: Company is Lawyers Title Insurance Corp")
	void CompanyOfRecord3486() {
		assertEquals("Lawyers Title Insurance Corp", customers.get(3485).getCompany());
	}

	@Test
	@DisplayName("Record 3486: Address is 8772 Factory")
	void AddressOfRecord3486() {
		assertEquals("8772 Factory", customers.get(3485).getAddress());
	}

	@Test
	@DisplayName("Record 3486: City is Evans Mills")
	void CityOfRecord3486() {
		assertEquals("Evans Mills", customers.get(3485).getCity());
	}

	@Test
	@DisplayName("Record 3486: County is Jefferson")
	void CountyOfRecord3486() {
		assertEquals("Jefferson", customers.get(3485).getCounty());
	}

	@Test
	@DisplayName("Record 3486: State is NY")
	void StateOfRecord3486() {
		assertEquals("NY", customers.get(3485).getState());
	}

	@Test
	@DisplayName("Record 3486: ZIP is 13637")
	void ZIPOfRecord3486() {
		assertEquals("13637", customers.get(3485).getZIP());
	}

	@Test
	@DisplayName("Record 3486: Phone is 315-629-2907")
	void PhoneOfRecord3486() {
		assertEquals("315-629-2907", customers.get(3485).getPhone());
	}

	@Test
	@DisplayName("Record 3486: Fax is 315-629-6192")
	void FaxOfRecord3486() {
		assertEquals("315-629-6192", customers.get(3485).getFax());
	}

	@Test
	@DisplayName("Record 3486: Email is kellie@sanots.com")
	void EmailOfRecord3486() {
		assertEquals("kellie@sanots.com", customers.get(3485).getEmail());
	}

	@Test
	@DisplayName("Record 3486: Web is http://www.kelliesanots.com")
	void WebOfRecord3486() {
		assertEquals("http://www.kelliesanots.com", customers.get(3485).getWeb());
	}
}
