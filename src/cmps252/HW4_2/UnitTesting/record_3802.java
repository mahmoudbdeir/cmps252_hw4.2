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
class Record_3802 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3802: FirstName is Eddie")
	void FirstNameOfRecord3802() {
		assertEquals("Eddie", customers.get(3801).getFirstName());
	}

	@Test
	@DisplayName("Record 3802: LastName is Olague")
	void LastNameOfRecord3802() {
		assertEquals("Olague", customers.get(3801).getLastName());
	}

	@Test
	@DisplayName("Record 3802: Company is Sm Friedman Toth & Baldridge")
	void CompanyOfRecord3802() {
		assertEquals("Sm Friedman Toth & Baldridge", customers.get(3801).getCompany());
	}

	@Test
	@DisplayName("Record 3802: Address is Route 59 Box 400  #-400")
	void AddressOfRecord3802() {
		assertEquals("Route 59 Box 400  #-400", customers.get(3801).getAddress());
	}

	@Test
	@DisplayName("Record 3802: City is Monsey")
	void CityOfRecord3802() {
		assertEquals("Monsey", customers.get(3801).getCity());
	}

	@Test
	@DisplayName("Record 3802: County is Rockland")
	void CountyOfRecord3802() {
		assertEquals("Rockland", customers.get(3801).getCounty());
	}

	@Test
	@DisplayName("Record 3802: State is NY")
	void StateOfRecord3802() {
		assertEquals("NY", customers.get(3801).getState());
	}

	@Test
	@DisplayName("Record 3802: ZIP is 10952")
	void ZIPOfRecord3802() {
		assertEquals("10952", customers.get(3801).getZIP());
	}

	@Test
	@DisplayName("Record 3802: Phone is 845-368-4481")
	void PhoneOfRecord3802() {
		assertEquals("845-368-4481", customers.get(3801).getPhone());
	}

	@Test
	@DisplayName("Record 3802: Fax is 845-368-9791")
	void FaxOfRecord3802() {
		assertEquals("845-368-9791", customers.get(3801).getFax());
	}

	@Test
	@DisplayName("Record 3802: Email is eddie@olague.com")
	void EmailOfRecord3802() {
		assertEquals("eddie@olague.com", customers.get(3801).getEmail());
	}

	@Test
	@DisplayName("Record 3802: Web is http://www.eddieolague.com")
	void WebOfRecord3802() {
		assertEquals("http://www.eddieolague.com", customers.get(3801).getWeb());
	}
}
