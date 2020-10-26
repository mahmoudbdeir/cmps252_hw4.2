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
class Record_3770 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3770: FirstName is Vicente")
	void FirstNameOfRecord3770() {
		assertEquals("Vicente", customers.get(3769).getFirstName());
	}

	@Test
	@DisplayName("Record 3770: LastName is Roggero")
	void LastNameOfRecord3770() {
		assertEquals("Roggero", customers.get(3769).getLastName());
	}

	@Test
	@DisplayName("Record 3770: Company is Thompson Plumb & Assocs Inc")
	void CompanyOfRecord3770() {
		assertEquals("Thompson Plumb & Assocs Inc", customers.get(3769).getCompany());
	}

	@Test
	@DisplayName("Record 3770: Address is 2000 S Dairy Ashford St")
	void AddressOfRecord3770() {
		assertEquals("2000 S Dairy Ashford St", customers.get(3769).getAddress());
	}

	@Test
	@DisplayName("Record 3770: City is Houston")
	void CityOfRecord3770() {
		assertEquals("Houston", customers.get(3769).getCity());
	}

	@Test
	@DisplayName("Record 3770: County is Harris")
	void CountyOfRecord3770() {
		assertEquals("Harris", customers.get(3769).getCounty());
	}

	@Test
	@DisplayName("Record 3770: State is TX")
	void StateOfRecord3770() {
		assertEquals("TX", customers.get(3769).getState());
	}

	@Test
	@DisplayName("Record 3770: ZIP is 77077")
	void ZIPOfRecord3770() {
		assertEquals("77077", customers.get(3769).getZIP());
	}

	@Test
	@DisplayName("Record 3770: Phone is 281-293-7390")
	void PhoneOfRecord3770() {
		assertEquals("281-293-7390", customers.get(3769).getPhone());
	}

	@Test
	@DisplayName("Record 3770: Fax is 281-293-8392")
	void FaxOfRecord3770() {
		assertEquals("281-293-8392", customers.get(3769).getFax());
	}

	@Test
	@DisplayName("Record 3770: Email is vicente@roggero.com")
	void EmailOfRecord3770() {
		assertEquals("vicente@roggero.com", customers.get(3769).getEmail());
	}

	@Test
	@DisplayName("Record 3770: Web is http://www.vicenteroggero.com")
	void WebOfRecord3770() {
		assertEquals("http://www.vicenteroggero.com", customers.get(3769).getWeb());
	}
}
