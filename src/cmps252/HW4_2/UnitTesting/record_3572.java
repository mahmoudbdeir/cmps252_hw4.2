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

@Tag("31")
class Record_3572 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3572: FirstName is Alma")
	void FirstNameOfRecord3572() {
		assertEquals("Alma", customers.get(3571).getFirstName());
	}

	@Test
	@DisplayName("Record 3572: LastName is Hiett")
	void LastNameOfRecord3572() {
		assertEquals("Hiett", customers.get(3571).getLastName());
	}

	@Test
	@DisplayName("Record 3572: Company is Royal Carpet")
	void CompanyOfRecord3572() {
		assertEquals("Royal Carpet", customers.get(3571).getCompany());
	}

	@Test
	@DisplayName("Record 3572: Address is 5930 54th St")
	void AddressOfRecord3572() {
		assertEquals("5930 54th St", customers.get(3571).getAddress());
	}

	@Test
	@DisplayName("Record 3572: City is Maspeth")
	void CityOfRecord3572() {
		assertEquals("Maspeth", customers.get(3571).getCity());
	}

	@Test
	@DisplayName("Record 3572: County is Queens")
	void CountyOfRecord3572() {
		assertEquals("Queens", customers.get(3571).getCounty());
	}

	@Test
	@DisplayName("Record 3572: State is NY")
	void StateOfRecord3572() {
		assertEquals("NY", customers.get(3571).getState());
	}

	@Test
	@DisplayName("Record 3572: ZIP is 11378")
	void ZIPOfRecord3572() {
		assertEquals("11378", customers.get(3571).getZIP());
	}

	@Test
	@DisplayName("Record 3572: Phone is 718-417-7428")
	void PhoneOfRecord3572() {
		assertEquals("718-417-7428", customers.get(3571).getPhone());
	}

	@Test
	@DisplayName("Record 3572: Fax is 718-417-7843")
	void FaxOfRecord3572() {
		assertEquals("718-417-7843", customers.get(3571).getFax());
	}

	@Test
	@DisplayName("Record 3572: Email is alma@hiett.com")
	void EmailOfRecord3572() {
		assertEquals("alma@hiett.com", customers.get(3571).getEmail());
	}

	@Test
	@DisplayName("Record 3572: Web is http://www.almahiett.com")
	void WebOfRecord3572() {
		assertEquals("http://www.almahiett.com", customers.get(3571).getWeb());
	}
}
