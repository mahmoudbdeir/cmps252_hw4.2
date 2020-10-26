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

@Tag("49")
class Record_2574 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2574: FirstName is Grant")
	void FirstNameOfRecord2574() {
		assertEquals("Grant", customers.get(2573).getFirstName());
	}

	@Test
	@DisplayName("Record 2574: LastName is Benck")
	void LastNameOfRecord2574() {
		assertEquals("Benck", customers.get(2573).getLastName());
	}

	@Test
	@DisplayName("Record 2574: Company is Gernert, Susan R Esq")
	void CompanyOfRecord2574() {
		assertEquals("Gernert, Susan R Esq", customers.get(2573).getCompany());
	}

	@Test
	@DisplayName("Record 2574: Address is 172 Otis St")
	void AddressOfRecord2574() {
		assertEquals("172 Otis St", customers.get(2573).getAddress());
	}

	@Test
	@DisplayName("Record 2574: City is Northborough")
	void CityOfRecord2574() {
		assertEquals("Northborough", customers.get(2573).getCity());
	}

	@Test
	@DisplayName("Record 2574: County is Worcester")
	void CountyOfRecord2574() {
		assertEquals("Worcester", customers.get(2573).getCounty());
	}

	@Test
	@DisplayName("Record 2574: State is MA")
	void StateOfRecord2574() {
		assertEquals("MA", customers.get(2573).getState());
	}

	@Test
	@DisplayName("Record 2574: ZIP is 1532")
	void ZIPOfRecord2574() {
		assertEquals("1532", customers.get(2573).getZIP());
	}

	@Test
	@DisplayName("Record 2574: Phone is 508-393-8250")
	void PhoneOfRecord2574() {
		assertEquals("508-393-8250", customers.get(2573).getPhone());
	}

	@Test
	@DisplayName("Record 2574: Fax is 508-393-0724")
	void FaxOfRecord2574() {
		assertEquals("508-393-0724", customers.get(2573).getFax());
	}

	@Test
	@DisplayName("Record 2574: Email is grant@benck.com")
	void EmailOfRecord2574() {
		assertEquals("grant@benck.com", customers.get(2573).getEmail());
	}

	@Test
	@DisplayName("Record 2574: Web is http://www.grantbenck.com")
	void WebOfRecord2574() {
		assertEquals("http://www.grantbenck.com", customers.get(2573).getWeb());
	}
}
