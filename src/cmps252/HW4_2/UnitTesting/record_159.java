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

@Tag("1")
class Record_159 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 159: FirstName is Adam")
	void FirstNameOfRecord159() {
		assertEquals("Adam", customers.get(158).getFirstName());
	}

	@Test
	@DisplayName("Record 159: LastName is Hottel")
	void LastNameOfRecord159() {
		assertEquals("Hottel", customers.get(158).getLastName());
	}

	@Test
	@DisplayName("Record 159: Company is Century 21 Adele Shaw & Assocs")
	void CompanyOfRecord159() {
		assertEquals("Century 21 Adele Shaw & Assocs", customers.get(158).getCompany());
	}

	@Test
	@DisplayName("Record 159: Address is 116 Madison St")
	void AddressOfRecord159() {
		assertEquals("116 Madison St", customers.get(158).getAddress());
	}

	@Test
	@DisplayName("Record 159: City is Hoboken")
	void CityOfRecord159() {
		assertEquals("Hoboken", customers.get(158).getCity());
	}

	@Test
	@DisplayName("Record 159: County is Hudson")
	void CountyOfRecord159() {
		assertEquals("Hudson", customers.get(158).getCounty());
	}

	@Test
	@DisplayName("Record 159: State is NJ")
	void StateOfRecord159() {
		assertEquals("NJ", customers.get(158).getState());
	}

	@Test
	@DisplayName("Record 159: ZIP is 7030")
	void ZIPOfRecord159() {
		assertEquals("7030", customers.get(158).getZIP());
	}

	@Test
	@DisplayName("Record 159: Phone is 201-653-5068")
	void PhoneOfRecord159() {
		assertEquals("201-653-5068", customers.get(158).getPhone());
	}

	@Test
	@DisplayName("Record 159: Fax is 201-653-4507")
	void FaxOfRecord159() {
		assertEquals("201-653-4507", customers.get(158).getFax());
	}

	@Test
	@DisplayName("Record 159: Email is adam@hottel.com")
	void EmailOfRecord159() {
		assertEquals("adam@hottel.com", customers.get(158).getEmail());
	}

	@Test
	@DisplayName("Record 159: Web is http://www.adamhottel.com")
	void WebOfRecord159() {
		assertEquals("http://www.adamhottel.com", customers.get(158).getWeb());
	}
}
