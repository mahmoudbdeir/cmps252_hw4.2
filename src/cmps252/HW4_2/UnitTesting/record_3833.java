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
class Record_3833 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3833: FirstName is Ike")
	void FirstNameOfRecord3833() {
		assertEquals("Ike", customers.get(3832).getFirstName());
	}

	@Test
	@DisplayName("Record 3833: LastName is Czelusniak")
	void LastNameOfRecord3833() {
		assertEquals("Czelusniak", customers.get(3832).getLastName());
	}

	@Test
	@DisplayName("Record 3833: Company is Sedgwick Noble Lowndes")
	void CompanyOfRecord3833() {
		assertEquals("Sedgwick Noble Lowndes", customers.get(3832).getCompany());
	}

	@Test
	@DisplayName("Record 3833: Address is 7202 Westbranch Dr")
	void AddressOfRecord3833() {
		assertEquals("7202 Westbranch Dr", customers.get(3832).getAddress());
	}

	@Test
	@DisplayName("Record 3833: City is Houston")
	void CityOfRecord3833() {
		assertEquals("Houston", customers.get(3832).getCity());
	}

	@Test
	@DisplayName("Record 3833: County is Harris")
	void CountyOfRecord3833() {
		assertEquals("Harris", customers.get(3832).getCounty());
	}

	@Test
	@DisplayName("Record 3833: State is TX")
	void StateOfRecord3833() {
		assertEquals("TX", customers.get(3832).getState());
	}

	@Test
	@DisplayName("Record 3833: ZIP is 77072")
	void ZIPOfRecord3833() {
		assertEquals("77072", customers.get(3832).getZIP());
	}

	@Test
	@DisplayName("Record 3833: Phone is 281-983-3295")
	void PhoneOfRecord3833() {
		assertEquals("281-983-3295", customers.get(3832).getPhone());
	}

	@Test
	@DisplayName("Record 3833: Fax is 281-983-6617")
	void FaxOfRecord3833() {
		assertEquals("281-983-6617", customers.get(3832).getFax());
	}

	@Test
	@DisplayName("Record 3833: Email is ike@czelusniak.com")
	void EmailOfRecord3833() {
		assertEquals("ike@czelusniak.com", customers.get(3832).getEmail());
	}

	@Test
	@DisplayName("Record 3833: Web is http://www.ikeczelusniak.com")
	void WebOfRecord3833() {
		assertEquals("http://www.ikeczelusniak.com", customers.get(3832).getWeb());
	}
}
