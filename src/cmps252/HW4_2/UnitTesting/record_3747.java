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

@Tag("48")
class Record_3747 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3747: FirstName is Karen")
	void FirstNameOfRecord3747() {
		assertEquals("Karen", customers.get(3746).getFirstName());
	}

	@Test
	@DisplayName("Record 3747: LastName is Holtham")
	void LastNameOfRecord3747() {
		assertEquals("Holtham", customers.get(3746).getLastName());
	}

	@Test
	@DisplayName("Record 3747: Company is Heller Ehrman Wht & Mcauliffe")
	void CompanyOfRecord3747() {
		assertEquals("Heller Ehrman Wht & Mcauliffe", customers.get(3746).getCompany());
	}

	@Test
	@DisplayName("Record 3747: Address is 200 S Michigan Ave")
	void AddressOfRecord3747() {
		assertEquals("200 S Michigan Ave", customers.get(3746).getAddress());
	}

	@Test
	@DisplayName("Record 3747: City is Chicago")
	void CityOfRecord3747() {
		assertEquals("Chicago", customers.get(3746).getCity());
	}

	@Test
	@DisplayName("Record 3747: County is Cook")
	void CountyOfRecord3747() {
		assertEquals("Cook", customers.get(3746).getCounty());
	}

	@Test
	@DisplayName("Record 3747: State is IL")
	void StateOfRecord3747() {
		assertEquals("IL", customers.get(3746).getState());
	}

	@Test
	@DisplayName("Record 3747: ZIP is 60604")
	void ZIPOfRecord3747() {
		assertEquals("60604", customers.get(3746).getZIP());
	}

	@Test
	@DisplayName("Record 3747: Phone is 312-322-6893")
	void PhoneOfRecord3747() {
		assertEquals("312-322-6893", customers.get(3746).getPhone());
	}

	@Test
	@DisplayName("Record 3747: Fax is 312-322-4025")
	void FaxOfRecord3747() {
		assertEquals("312-322-4025", customers.get(3746).getFax());
	}

	@Test
	@DisplayName("Record 3747: Email is karen@holtham.com")
	void EmailOfRecord3747() {
		assertEquals("karen@holtham.com", customers.get(3746).getEmail());
	}

	@Test
	@DisplayName("Record 3747: Web is http://www.karenholtham.com")
	void WebOfRecord3747() {
		assertEquals("http://www.karenholtham.com", customers.get(3746).getWeb());
	}
}
