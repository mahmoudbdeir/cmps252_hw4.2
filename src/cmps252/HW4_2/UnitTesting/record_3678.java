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

@Tag("25")
class Record_3678 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3678: FirstName is Julian")
	void FirstNameOfRecord3678() {
		assertEquals("Julian", customers.get(3677).getFirstName());
	}

	@Test
	@DisplayName("Record 3678: LastName is Nurthen")
	void LastNameOfRecord3678() {
		assertEquals("Nurthen", customers.get(3677).getLastName());
	}

	@Test
	@DisplayName("Record 3678: Company is Mcintyre, Alexander M Jr")
	void CompanyOfRecord3678() {
		assertEquals("Mcintyre, Alexander M Jr", customers.get(3677).getCompany());
	}

	@Test
	@DisplayName("Record 3678: Address is 906 S Tyler St")
	void AddressOfRecord3678() {
		assertEquals("906 S Tyler St", customers.get(3677).getAddress());
	}

	@Test
	@DisplayName("Record 3678: City is Amarillo")
	void CityOfRecord3678() {
		assertEquals("Amarillo", customers.get(3677).getCity());
	}

	@Test
	@DisplayName("Record 3678: County is Potter")
	void CountyOfRecord3678() {
		assertEquals("Potter", customers.get(3677).getCounty());
	}

	@Test
	@DisplayName("Record 3678: State is TX")
	void StateOfRecord3678() {
		assertEquals("TX", customers.get(3677).getState());
	}

	@Test
	@DisplayName("Record 3678: ZIP is 79101")
	void ZIPOfRecord3678() {
		assertEquals("79101", customers.get(3677).getZIP());
	}

	@Test
	@DisplayName("Record 3678: Phone is 806-376-8343")
	void PhoneOfRecord3678() {
		assertEquals("806-376-8343", customers.get(3677).getPhone());
	}

	@Test
	@DisplayName("Record 3678: Fax is 806-376-1407")
	void FaxOfRecord3678() {
		assertEquals("806-376-1407", customers.get(3677).getFax());
	}

	@Test
	@DisplayName("Record 3678: Email is julian@nurthen.com")
	void EmailOfRecord3678() {
		assertEquals("julian@nurthen.com", customers.get(3677).getEmail());
	}

	@Test
	@DisplayName("Record 3678: Web is http://www.juliannurthen.com")
	void WebOfRecord3678() {
		assertEquals("http://www.juliannurthen.com", customers.get(3677).getWeb());
	}
}
