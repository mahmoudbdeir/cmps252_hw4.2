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

@Tag("15")
class Record_2290 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2290: FirstName is Edmundo")
	void FirstNameOfRecord2290() {
		assertEquals("Edmundo", customers.get(2289).getFirstName());
	}

	@Test
	@DisplayName("Record 2290: LastName is Rubenstone")
	void LastNameOfRecord2290() {
		assertEquals("Rubenstone", customers.get(2289).getLastName());
	}

	@Test
	@DisplayName("Record 2290: Company is Floyd Sizemore Architects")
	void CompanyOfRecord2290() {
		assertEquals("Floyd Sizemore Architects", customers.get(2289).getCompany());
	}

	@Test
	@DisplayName("Record 2290: Address is 2614 W Beverly Blvd")
	void AddressOfRecord2290() {
		assertEquals("2614 W Beverly Blvd", customers.get(2289).getAddress());
	}

	@Test
	@DisplayName("Record 2290: City is Montebello")
	void CityOfRecord2290() {
		assertEquals("Montebello", customers.get(2289).getCity());
	}

	@Test
	@DisplayName("Record 2290: County is Los Angeles")
	void CountyOfRecord2290() {
		assertEquals("Los Angeles", customers.get(2289).getCounty());
	}

	@Test
	@DisplayName("Record 2290: State is CA")
	void StateOfRecord2290() {
		assertEquals("CA", customers.get(2289).getState());
	}

	@Test
	@DisplayName("Record 2290: ZIP is 90640")
	void ZIPOfRecord2290() {
		assertEquals("90640", customers.get(2289).getZIP());
	}

	@Test
	@DisplayName("Record 2290: Phone is 323-720-3283")
	void PhoneOfRecord2290() {
		assertEquals("323-720-3283", customers.get(2289).getPhone());
	}

	@Test
	@DisplayName("Record 2290: Fax is 323-720-1659")
	void FaxOfRecord2290() {
		assertEquals("323-720-1659", customers.get(2289).getFax());
	}

	@Test
	@DisplayName("Record 2290: Email is edmundo@rubenstone.com")
	void EmailOfRecord2290() {
		assertEquals("edmundo@rubenstone.com", customers.get(2289).getEmail());
	}

	@Test
	@DisplayName("Record 2290: Web is http://www.edmundorubenstone.com")
	void WebOfRecord2290() {
		assertEquals("http://www.edmundorubenstone.com", customers.get(2289).getWeb());
	}
}
