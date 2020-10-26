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

@Tag("39")
class Record_3080 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3080: FirstName is Hosea")
	void FirstNameOfRecord3080() {
		assertEquals("Hosea", customers.get(3079).getFirstName());
	}

	@Test
	@DisplayName("Record 3080: LastName is Pfisterer")
	void LastNameOfRecord3080() {
		assertEquals("Pfisterer", customers.get(3079).getLastName());
	}

	@Test
	@DisplayName("Record 3080: Company is Van Leer Containers Inc")
	void CompanyOfRecord3080() {
		assertEquals("Van Leer Containers Inc", customers.get(3079).getCompany());
	}

	@Test
	@DisplayName("Record 3080: Address is 16925 Main St  #-d")
	void AddressOfRecord3080() {
		assertEquals("16925 Main St  #-d", customers.get(3079).getAddress());
	}

	@Test
	@DisplayName("Record 3080: City is Hesperia")
	void CityOfRecord3080() {
		assertEquals("Hesperia", customers.get(3079).getCity());
	}

	@Test
	@DisplayName("Record 3080: County is San Bernardino")
	void CountyOfRecord3080() {
		assertEquals("San Bernardino", customers.get(3079).getCounty());
	}

	@Test
	@DisplayName("Record 3080: State is CA")
	void StateOfRecord3080() {
		assertEquals("CA", customers.get(3079).getState());
	}

	@Test
	@DisplayName("Record 3080: ZIP is 92345")
	void ZIPOfRecord3080() {
		assertEquals("92345", customers.get(3079).getZIP());
	}

	@Test
	@DisplayName("Record 3080: Phone is 760-244-4657")
	void PhoneOfRecord3080() {
		assertEquals("760-244-4657", customers.get(3079).getPhone());
	}

	@Test
	@DisplayName("Record 3080: Fax is 760-244-8699")
	void FaxOfRecord3080() {
		assertEquals("760-244-8699", customers.get(3079).getFax());
	}

	@Test
	@DisplayName("Record 3080: Email is hosea@pfisterer.com")
	void EmailOfRecord3080() {
		assertEquals("hosea@pfisterer.com", customers.get(3079).getEmail());
	}

	@Test
	@DisplayName("Record 3080: Web is http://www.hoseapfisterer.com")
	void WebOfRecord3080() {
		assertEquals("http://www.hoseapfisterer.com", customers.get(3079).getWeb());
	}
}
