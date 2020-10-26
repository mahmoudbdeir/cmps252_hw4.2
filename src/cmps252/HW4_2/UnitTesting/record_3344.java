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

@Tag("3")
class Record_3344 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3344: FirstName is Jarrett")
	void FirstNameOfRecord3344() {
		assertEquals("Jarrett", customers.get(3343).getFirstName());
	}

	@Test
	@DisplayName("Record 3344: LastName is Bouvier")
	void LastNameOfRecord3344() {
		assertEquals("Bouvier", customers.get(3343).getLastName());
	}

	@Test
	@DisplayName("Record 3344: Company is South Eastern Fabricare Assn")
	void CompanyOfRecord3344() {
		assertEquals("South Eastern Fabricare Assn", customers.get(3343).getCompany());
	}

	@Test
	@DisplayName("Record 3344: Address is 1515 Montana Ave")
	void AddressOfRecord3344() {
		assertEquals("1515 Montana Ave", customers.get(3343).getAddress());
	}

	@Test
	@DisplayName("Record 3344: City is El Paso")
	void CityOfRecord3344() {
		assertEquals("El Paso", customers.get(3343).getCity());
	}

	@Test
	@DisplayName("Record 3344: County is El Paso")
	void CountyOfRecord3344() {
		assertEquals("El Paso", customers.get(3343).getCounty());
	}

	@Test
	@DisplayName("Record 3344: State is TX")
	void StateOfRecord3344() {
		assertEquals("TX", customers.get(3343).getState());
	}

	@Test
	@DisplayName("Record 3344: ZIP is 79902")
	void ZIPOfRecord3344() {
		assertEquals("79902", customers.get(3343).getZIP());
	}

	@Test
	@DisplayName("Record 3344: Phone is 915-544-9427")
	void PhoneOfRecord3344() {
		assertEquals("915-544-9427", customers.get(3343).getPhone());
	}

	@Test
	@DisplayName("Record 3344: Fax is 915-544-9017")
	void FaxOfRecord3344() {
		assertEquals("915-544-9017", customers.get(3343).getFax());
	}

	@Test
	@DisplayName("Record 3344: Email is jarrett@bouvier.com")
	void EmailOfRecord3344() {
		assertEquals("jarrett@bouvier.com", customers.get(3343).getEmail());
	}

	@Test
	@DisplayName("Record 3344: Web is http://www.jarrettbouvier.com")
	void WebOfRecord3344() {
		assertEquals("http://www.jarrettbouvier.com", customers.get(3343).getWeb());
	}
}
