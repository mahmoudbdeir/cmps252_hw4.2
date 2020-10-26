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

@Tag("46")
class Record_3843 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3843: FirstName is Leota")
	void FirstNameOfRecord3843() {
		assertEquals("Leota", customers.get(3842).getFirstName());
	}

	@Test
	@DisplayName("Record 3843: LastName is stonebach")
	void LastNameOfRecord3843() {
		assertEquals("stonebach", customers.get(3842).getLastName());
	}

	@Test
	@DisplayName("Record 3843: Company is Roser & Associates")
	void CompanyOfRecord3843() {
		assertEquals("Roser & Associates", customers.get(3842).getCompany());
	}

	@Test
	@DisplayName("Record 3843: Address is 901 Hotl Jast Bldg")
	void AddressOfRecord3843() {
		assertEquals("901 Hotl Jast Bldg", customers.get(3842).getAddress());
	}

	@Test
	@DisplayName("Record 3843: City is Jamestown")
	void CityOfRecord3843() {
		assertEquals("Jamestown", customers.get(3842).getCity());
	}

	@Test
	@DisplayName("Record 3843: County is Chautauqua")
	void CountyOfRecord3843() {
		assertEquals("Chautauqua", customers.get(3842).getCounty());
	}

	@Test
	@DisplayName("Record 3843: State is NY")
	void StateOfRecord3843() {
		assertEquals("NY", customers.get(3842).getState());
	}

	@Test
	@DisplayName("Record 3843: ZIP is 14701")
	void ZIPOfRecord3843() {
		assertEquals("14701", customers.get(3842).getZIP());
	}

	@Test
	@DisplayName("Record 3843: Phone is 716-483-6093")
	void PhoneOfRecord3843() {
		assertEquals("716-483-6093", customers.get(3842).getPhone());
	}

	@Test
	@DisplayName("Record 3843: Fax is 716-483-3959")
	void FaxOfRecord3843() {
		assertEquals("716-483-3959", customers.get(3842).getFax());
	}

	@Test
	@DisplayName("Record 3843: Email is leota@stonebach.com")
	void EmailOfRecord3843() {
		assertEquals("leota@stonebach.com", customers.get(3842).getEmail());
	}

	@Test
	@DisplayName("Record 3843: Web is http://www.leotastonebach.com")
	void WebOfRecord3843() {
		assertEquals("http://www.leotastonebach.com", customers.get(3842).getWeb());
	}
}
